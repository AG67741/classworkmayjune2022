package hrmsappwithannotation.app;

import hrmsappwithannotation.data.Department;
import hrmsappwithannotation.service.DepartmentService;
import hrmsappwithannotation.service.DepartmentServiceImpl;

public class HRMSAppWithAnnotation {

	public static void main(String[] args) {
		DepartmentService departmentService = new DepartmentServiceImpl();
		Department dept = departmentService.getDepartmentById(15);
		System.out.println(dept);
	}

}
