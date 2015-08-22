package com.wxisme.test;

import java.util.List;

import com.wxisme.sorm.core.Query;
import com.wxisme.sorm.core.QueryFactory;
import com.wxisme.vo.EmpVO;

/**
 * 客户端调用的测试类
 * @author administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Query q = QueryFactory.createQuery();
		String sql2 = "select e.id,e.empname,salary+bonus 'xinshui',age,d.dname 'deptName',d.address 'deptAddr' from emp e "
			+"join dept d on e.deptId=d.id ";
		List<EmpVO> list2 = q.queryRows(sql2,EmpVO.class, null);
		for(EmpVO e:list2){
			System.out.println(e.getEmpname()+"-"+e.getDeptAddr()+"-"+e.getSalary());
		}
		
		Query q2 = QueryFactory.createQuery();
		String sql3 = "select e.id,e.empname,salary+bonus 'xinshui',age,d.dname 'deptName',d.address 'deptAddr' from emp e "
			+"join dept d on e.deptId=d.id ";
		List<EmpVO> list3 = q2.queryRows(sql2,EmpVO.class, null);
		for(EmpVO e:list3){
			System.out.println(e.getEmpname()+"-"+e.getDeptAddr()+"-"+e.getSalary());
		}
	}
}
