import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return Student;
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(student==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		return null;
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		if(index<0||index>=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else if(index<0||index>=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
		
			students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
		int index=0;
		students[index]=student;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
		int index=students.length-1;
		students[index]=student;
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
				if(student==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else if(index<0||index>=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
			students[index]=student;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(student==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else if(index<0||index>=students.length)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
			int i;
			for(i=0;i<students.length;i++)
			{
				if(i==index)
				{
					
			students[i]=students[i+1];
				}
			}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if()
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i;
		String temp[];
		for(i=0;i<students.length;i++)
		{
			if(students[i]>students[i+1])
			{
				temp[i]=students[i];
				students[i]=students[i+1];
				students[i+1]=temp[i];
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		int i;
		if(date==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
			
		for(i=0;i<students.length;i++)
		{
			if(this.birthDate<=date)
			{
				return students[i];
			}
		}
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null||lastDate==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
			for(i=0;i<students.length;i++)
		{
			if(this.birthDate==firstDate&&this.birthDate==lastDate)
			{
				return students[i];
			}
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null)
		{
			throw new Exception("IllegalArgumentException");
		}
		else{
			int i;
			for(i=0;i<days;i++)
			{
				date++;
			}
			for(i=0;i<date;i++)
			{
				return students[i];
			}
		}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		int i;
		for(i=0;i<students.length-1;i++)
		{
			if(i==indexOfStudent)
			{
				return students[i];
				full
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
