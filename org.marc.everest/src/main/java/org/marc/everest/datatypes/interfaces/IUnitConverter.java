/* 
 * Copyright 2008-2013 Mohawk College of Applied Arts and Technology
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations under 
 * the License.
 * 
 * User: Justin Fyfe
 * Date: 10-29-2012
 */
package org.marc.everest.datatypes.interfaces;

import org.marc.everest.datatypes.PQ;

/**
 * Represents implementations that can convert data between two units
 */
public interface IUnitConverter {

	/**
	 * Returns true if the specified PQ can be converted to the specified unit
	 */
    boolean canConvert(PQ from, String unitTo);

    /**
     * Performs the conversion
     */
    PQ convert(PQ original, String unitTo);
}
