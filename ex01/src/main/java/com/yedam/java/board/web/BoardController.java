package com.yedam.java.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService service;
	
	
	//등록 -입력폼 
	@GetMapping("/insert")
	public String insertBoardForm(Model model) {
		model.addAttribute("no", service.getClass());
		//뷰만 처리
		return "board/boardInsert";
	}
	
	//등록 -db insert
	@PostMapping("/insert")
	public String insertBook(BoardVO boardVO) {
		service.insertBoard(boardVO);
		return "redirect:list";
	}
	
	//전체조회
	@GetMapping("/list")
	public String selectBoardList(Model model) {
		//값을 담을 model 
		model.addAttribute("boardList", service.getBoardList());
		return "board/boardList";
	}
	
	//단건 조회
	@GetMapping("/info")
	public String selectBoardInfo(BoardVO boardVO, Model model) {
		model.addAttribute("board", service.getBoardInfo(boardVO));
		return "board/boardInfo";
	}
	
	//수정 -폼 -> 원본데이터에 출력되어야함
	@GetMapping("/update")
	public String updateForm(BoardVO boardVO, Model model) {
		model.addAttribute("board", service.getBoardInfo(boardVO));
		return "board/boardUpdate";
	}
	
	//수정 -DB update
	@PostMapping("/update")
	public String updateBoardInfo(BoardVO boardVO) {
		service.updateBoard(boardVO);
		return "redirect:list";
	}
	//여기서 만든 컨트롤러를 동작시키기 위해 view 만들기
	
}
