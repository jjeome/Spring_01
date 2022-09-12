<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	* {
  box-sizing: border-box;
}

/* Remove margins and padding from the list */
ul {
  margin: 0;
  padding: 0;
}

/* Style the list items */
ul li {
  cursor: pointer;
  position: relative;
  padding: 12px 8px 12px 40px;
  background: #eee;
  font-size: 18px;
  transition: 0.2s;

  /* make the list items unselectable */
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* Set all odd list items to a different color (zebra-stripes) */
ul li:nth-child(odd) {
  background: #f9f9f9;
}

/* Darker background-color on hover */
ul li:hover {
  background: #ddd;
}

/* When clicked on, add a background color and strike out text */
ul li.checked {
  background: #888;
  color: #fff;
  text-decoration: line-through;
}

/* Add a "checked" mark when clicked on */
ul li.checked::before {
  content: '';
  position: absolute;
  border-color: #fff;
  border-style: solid;
  border-width: 0 2px 2px 0;
  top: 10px;
  left: 16px;
  transform: rotate(45deg);
  height: 15px;
  width: 7px;
}

/* Style the close button */
.close {
  position: absolute;
  right: 0;
  top: 0;
  padding: 12px 16px 12px 16px;
}

.close:hover {
  background-color: #f44336;
  color: white;
}

/* Style the header */
.header {
  background-color: #f44336;
  padding: 30px 40px;
  color: white;
  text-align: center;
}

/* Clear floats after the header */
.header:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the input */
input {
  margin: 0;
  border: none;
  border-radius: 0;
  width: 75%;
  padding: 10px;
  float: left;
  font-size: 16px;
}

/* Style the "Add" button */
.addBtn {
  padding: 10px;
  width: 25%;
  background: #d9d9d9;
  color: #555;
  float: left;
  text-align: center;
  font-size: 16px;
  cursor: pointer;
  transition: 0.3s;
  border-radius: 0;
}

.addBtn:hover {
  background-color: #bbb;
}
</style>
</head>
<body>
	<script>
		let template = `<div>
                  <ul id="myUL">
                    <template v-for="item in items">
                     <li v-bind:key="item.no"
                          v-bind:class="{ checked : item.yn }"
                          v-on:click="checkedItem(item.no)">
                          {{ item.contents }}
                          <span class="close"
                                v-on:click="deleteItem(item.no)">x</span>
                      </li>
                    </template>
                  </ul>
                </div>`; 


		export default {
		  template : template,
		  
		  data : function(){
		    return {
		      //created로 data를 items으로 받고, itemList로 뿌림
		      items : [],
		      updateItem : {} 
		    }
		  },
		  computed : {
		    itemList : function(){
		      
		    }
		  },
		
		  watch: {
		    updateItem : function(){
		
		    }
		  },
		
		  //데이터들어오는 created속성
		  created : function(){
		    const component = this;
		    $.ajax({
		      url : 'http://192.168.35.88:8088/myserver/todoSelect',
		      type : 'get',
		      data : {
		        id : 56
		      },
		      dataType : 'json',
		      success : function(data){
		        if(data != null){
		          component.items = data;
		        }
		      },
		      error : function(reject){
		        console.log(reject);
		      }
		    })
		    
		
		  },
		  methods : {
		    loadData : function(){
		     
		    },
		    checkedItem : function(no, todoyn){
		      const component = this; 
		
		      if(todoyn == 0){
		        let zero = todoyn;
		      } else if(todoyn == 1){
		        let one = todoyn;
		      }
		
		      $.ajax({
		        url:'http://192.168.35.88:8088/myserver/todoUpdate',
		        type : 'get',
		        data : {
		          id : 56,
		          no : no,
		          todoyn : zero
		        },
		        dataTyep : 'json',
		        success : function(data){
		          if(todoyn == zero){
		            component.todoyn = true;
		          } 
		
		          if(todoyn == one){
		            component.todoyn = false;
		          }
		        },
		        error : function(reject){
		          console.log(reject)
		        }
		      })
		    },
		    deleteItem : function(no){
		      const component = this;
		      $.ajax({
		        url:'http://192.168.0.83:8088/myserver/todoDelete',
		        type : 'get',
		        data : {
		          id : 56,
		          no : no
		        },
		        dataType : 'json',
		        success : function(data){
		          if(data != null){
		            component.$router.go(0);
		          }
		        },
		        error : function(reject){
		          console.log(reject);
		        }
		      })
		    }
		  }
		}
	</script>
</body>
</html>