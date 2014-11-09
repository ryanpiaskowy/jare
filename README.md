Jare - Java Business Rules Engine
=================================

Java Business Rule Engine source files.

The Rule Engine allows to implement business rules in a central location and outside the code - be it a web application, a standalone application, an ETL tool or any other java based tool - so that, if the rules change the code does not have to change - only the rules change.

Additionally there is a web application available, which allows to define rules in an easy and quick way. yet very complex scenarios are possible by combining rules with "and" and "or" conditions and by grouping them together.

You may download the jar library which contains the sources compiled with Java 1.6

If you want to instantiate the rule engine from code follow following steps to process a csv file. Make sure that
the Business Rule Engine jar file is in the Java classpath.

// Import the BusinessRulesEngine, ZipFile, BufferedReader, Row, Splitter and the File class

	import com.datamelt.rules.engine.BusinessRulesEngine;
	import java.util.zip.ZipFile;
	import java.io.File;
	import java.io.BufferedReader;
	import com.datamelt.util.Row;
	import com.datamelt.util.Splitter;

// Use the Rule Maintenance Web application to create a zip file containing the rules, or write the rules by hand (see the documentation for details).

	ZipFile zip = new ZipFile(realFilename);
	
// Create an instance of the BusinessRulesEngine class and pass the zip file.

	BusinessRulesEngine engine = new BusinessRulesEngine(zip);

// Now you need some data. For example from a csv file. Per default a semicolon (;) as a devider for the individual fields. 

	File file = new File(<path and name of the csv file>);
	BufferedReader reader = new BufferedReader(new FileReader(file));

// Loop over the csv file line per line. Each line is split into its individual fields and assigned to a Row object. And finally run the rule engine passing the row of data.
	
	while ((line=reader.readLine())!=null)
	{
        Row row = splitter.getRow(line); 
        engine.run("row: " + counter, row);
    }


You may use any Java object and check it with the rule engine. This includes data from files or databases. For more details please read the documentation.

Please send your feedback and help to enhance the tool.

    Copyright (C) 2008-2014  Uwe Geercken
    
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see http://www.gnu.org/licenses

uwe geercken
uwe.geercken@web.de

last update: 2014-11-00
