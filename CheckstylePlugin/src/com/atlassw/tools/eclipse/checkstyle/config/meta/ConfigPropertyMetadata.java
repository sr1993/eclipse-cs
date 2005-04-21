//============================================================================
//
// Copyright (C) 2002-2004  David Schneider
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//============================================================================

package com.atlassw.tools.eclipse.checkstyle.config.meta;

//=================================================
// Imports from java namespace
//=================================================

//=================================================
// Imports from javax namespace
//=================================================

//=================================================
// Imports from com namespace
//=================================================
import java.util.ArrayList;
import java.util.List;

import com.atlassw.tools.eclipse.checkstyle.Messages;

/**
 * This class represents metadata about one of a rule's properties.
 */
public class ConfigPropertyMetadata implements Cloneable
{
    //=================================================
    // Public static final variables.
    //=================================================

    //=================================================
    // Static class variables.
    //=================================================

    //=================================================
    // Instance member variables.
    //=================================================

    /** The type of the property data. */
    private ConfigPropertyType mDatatype;

    /** The name of the property. */
    private String mName;

    /** The default value of the property. */
    private String mDefaultValue;

    /** The description of the property. */
    private String mDescription;

    /** The list of possible property values. */
    private List mEnumeration = new ArrayList();

    //=================================================
    // Constructors & finalizer.
    //=================================================

    /**
     * Creates the property metadata.
     * 
     * @param type the property type
     * @param name the name of the property
     * @param defaultValue the default value
     */
    public ConfigPropertyMetadata(ConfigPropertyType type, String name, String defaultValue)
    {
        mDatatype = type;
        mName = name;
        mDefaultValue = defaultValue;
        mDescription = Messages.ConfigPropertyMetadata_txtNoDescription;
    }

    //=================================================
    // Methods.
    //=================================================

    /**
     * Get the property's datatype.
     * 
     * @return The datatype
     */
    public ConfigPropertyType getDatatype()
    {
        return mDatatype;
    }

    /**
     * Get the property's name.
     * 
     * @return The name
     */
    public String getName()
    {
        return mName;
    }

    /**
     * Get the property's description.
     * 
     * @return The description
     */
    public String getDescription()
    {
        return mDescription;
    }

    /**
     * Sets the description of this property.
     * 
     * @param description the description
     */
    public void setDescription(String description)
    {
        mDescription = description;
    }

    /**
     * Get the default value.
     * 
     * @return The default value
     */
    public String getDefaultValue()
    {
        return mDefaultValue;
    }

    /**
     * Get the enumeration of allowable values.
     * 
     * @return Enumeration of values
     */
    public List getPropertyEnumeration()
    {
        return mEnumeration;
    }

    /**
     * Returns the hidden.
     * 
     * @return boolean
     */
    public boolean isHidden()
    {
        return ConfigPropertyType.HIDDEN.equals(mDatatype);
    }

    /**
     * Clone the object.
     * 
     * @return The cloned object.
     */
    public Object clone()
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new InternalError(); //Should not happen
        }
    }

}