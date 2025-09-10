/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAggrSoftDeviceListRequest extends AbstractModel {

    /**
    * 过滤条件
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 软件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 0:win 2:mac
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
     * Get 过滤条件 
     * @return Condition 过滤条件
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件
     * @param Condition 过滤条件
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 软件名 
     * @return Name 软件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 软件名
     * @param Name 软件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 0:win 2:mac 
     * @return OsType 0:win 2:mac
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 0:win 2:mac
     * @param OsType 0:win 2:mac
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public DescribeAggrSoftDeviceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggrSoftDeviceListRequest(DescribeAggrSoftDeviceListRequest source) {
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

