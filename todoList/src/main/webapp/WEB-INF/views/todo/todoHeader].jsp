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
	let template = `<div id="myDIV" class="header">
	                <h2>My To Do List</h2>
	                <input type="text" id="myInput" v-model="title" placeholder="Title...">
	                <!-- <span onclick="newElement()" class="addBtn">Add</span> -->'
	                <span v-on:click="addItem" class="addBtn">
	                Add
	                </span>
	                </div>`
	
	//받은 값 서버에 넘기고 출력할 컴포넌트 호출 -> 해당컴포넌트에서 서버 데이터가지고옴
	export default{
	  template : template,
	  
	  data : function(){
	    return {
	      title : ''
	    }
	  },
	  methods : {
	    addItem : function(){
	      const component = this;
	      $.ajax({
	        url : 'http://192.168.0.83:8088/myserver/todoInsert',
	        data : {
	          id : 56,
	          contents : component.title
	        },
	        dataType : 'json',
	        success : function(data){
	          if(data != null){
	            alert('To Do List Add!!');
	            //새로고침
	            component.$router.go(0);
	          }
	        },
	        error : function(reject){
	          console.log(reject)
	        }
	      })
	    }
	  }
	}
	</script>
</body>
</html>