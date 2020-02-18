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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListInstance extends AbstractModel{

    /**
    * 对象唯一id
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * 表示对象实例的维度集合，jsonObj字符串
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽
    */
    @SerializedName("IsShielded")
    @Expose
    private Long IsShielded;

    /**
    * 对象所在的地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 对象唯一id 
     * @return UniqueId 对象唯一id
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set 对象唯一id
     * @param UniqueId 对象唯一id
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get 表示对象实例的维度集合，jsonObj字符串 
     * @return Dimensions 表示对象实例的维度集合，jsonObj字符串
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 表示对象实例的维度集合，jsonObj字符串
     * @param Dimensions 表示对象实例的维度集合，jsonObj字符串
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽 
     * @return IsShielded 对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽
     */
    public Long getIsShielded() {
        return this.IsShielded;
    }

    /**
     * Set 对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽
     * @param IsShielded 对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽
     */
    public void setIsShielded(Long IsShielded) {
        this.IsShielded = IsShielded;
    }

    /**
     * Get 对象所在的地域 
     * @return Region 对象所在的地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 对象所在的地域
     * @param Region 对象所在的地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "IsShielded", this.IsShielded);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

