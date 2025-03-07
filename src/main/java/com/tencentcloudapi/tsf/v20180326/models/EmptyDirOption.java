/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmptyDirOption extends AbstractModel {

    /**
    * -
    */
    @SerializedName("EnableMemory")
    @Expose
    private Boolean EnableMemory;

    /**
    * -
    */
    @SerializedName("StorageCapacity")
    @Expose
    private Long StorageCapacity;

    /**
    * -
    */
    @SerializedName("StorageUnit")
    @Expose
    private String StorageUnit;

    /**
    * -
    */
    @SerializedName("SizeLimit")
    @Expose
    private String SizeLimit;

    /**
     * Get - 
     * @return EnableMemory -
     */
    public Boolean getEnableMemory() {
        return this.EnableMemory;
    }

    /**
     * Set -
     * @param EnableMemory -
     */
    public void setEnableMemory(Boolean EnableMemory) {
        this.EnableMemory = EnableMemory;
    }

    /**
     * Get - 
     * @return StorageCapacity -
     */
    public Long getStorageCapacity() {
        return this.StorageCapacity;
    }

    /**
     * Set -
     * @param StorageCapacity -
     */
    public void setStorageCapacity(Long StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * Get - 
     * @return StorageUnit -
     */
    public String getStorageUnit() {
        return this.StorageUnit;
    }

    /**
     * Set -
     * @param StorageUnit -
     */
    public void setStorageUnit(String StorageUnit) {
        this.StorageUnit = StorageUnit;
    }

    /**
     * Get - 
     * @return SizeLimit -
     */
    public String getSizeLimit() {
        return this.SizeLimit;
    }

    /**
     * Set -
     * @param SizeLimit -
     */
    public void setSizeLimit(String SizeLimit) {
        this.SizeLimit = SizeLimit;
    }

    public EmptyDirOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmptyDirOption(EmptyDirOption source) {
        if (source.EnableMemory != null) {
            this.EnableMemory = new Boolean(source.EnableMemory);
        }
        if (source.StorageCapacity != null) {
            this.StorageCapacity = new Long(source.StorageCapacity);
        }
        if (source.StorageUnit != null) {
            this.StorageUnit = new String(source.StorageUnit);
        }
        if (source.SizeLimit != null) {
            this.SizeLimit = new String(source.SizeLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableMemory", this.EnableMemory);
        this.setParamSimple(map, prefix + "StorageCapacity", this.StorageCapacity);
        this.setParamSimple(map, prefix + "StorageUnit", this.StorageUnit);
        this.setParamSimple(map, prefix + "SizeLimit", this.SizeLimit);

    }
}

