public class Time1 {

	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// set a new time value using universal time; throw an
	// exception if the hour, minute or second is invalid
	public void setTime( int h, int m, int s ) {

		// validate hour, minute and second
		if ( (h >= 0 && h < 24 ) && ( m >= 0 && m < 60 ) && 
			 (s >= 0 && s < 60 )) {
			hour = h;
			minute = m;
			second = s;
		} // end if
		else 
			throw new IllegalArgumentException(
				"hour, minute and/or second was out of range" );
	} // end method  setTime

	public String toUniversalString() {

		return String.format("%2d:%02d:%02d", hour, minute, second );
	}

	public String toString() {

		return String.format("%d:%02d:%02d %s", 
			((hour == 0 || hour == 12) ? 12 : hour % 12 ),
			minute, second, (hour < 12 ? "AM" : "PM"));

	} // end method to string

} // end class Time1 