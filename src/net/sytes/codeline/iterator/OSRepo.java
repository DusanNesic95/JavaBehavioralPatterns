package net.sytes.codeline.iterator;

public class OSRepo implements Container {
	
	public String[] operatingSystems = {"macOS", "Windows", "Linux", "Solaris", "Android", "iOS", "Tizen"};

	@Override
	public Iterator getIterator() {
		return new OSIterator();
	}

	private class OSIterator implements Iterator {

		int index;
		
		@Override
		public boolean hasNext() {
			if (index < operatingSystems.length) {
				return true;
			}
			
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return operatingSystems[index++];
			}
			
			return null;
		}
		
	}
}
