package com.david.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.david.judge.Problem;
import com.david.mapper.ProblemMapper;
import com.david.service.IProblemService;
import com.david.vo.ProblemVo;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author david
 * @since 2025-07-21
 */
@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, Problem> implements IProblemService {
	public ProblemVo getProblemDtoById(Long id) {
		Problem problem = this.getById(id);
		if (problem == null)
			return null;
		ProblemVo problemVo = new ProblemVo();
		BeanUtils.copyProperties(problem, problemVo);
		return problemVo;
	}
}
