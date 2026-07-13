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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListInstance extends AbstractModel {

    /**
    * <p>对象唯一id</p>
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * <p>表示对象实例的维度集合，jsonObj字符串</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * <p>对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽</p>
    */
    @SerializedName("IsShielded")
    @Expose
    private Long IsShielded;

    /**
    * <p>对象所在的地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get <p>对象唯一id</p> 
     * @return UniqueId <p>对象唯一id</p>
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set <p>对象唯一id</p>
     * @param UniqueId <p>对象唯一id</p>
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get <p>表示对象实例的维度集合，jsonObj字符串</p> 
     * @return Dimensions <p>表示对象实例的维度集合，jsonObj字符串</p>
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>表示对象实例的维度集合，jsonObj字符串</p>
     * @param Dimensions <p>表示对象实例的维度集合，jsonObj字符串</p>
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽</p> 
     * @return IsShielded <p>对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽</p>
     */
    public Long getIsShielded() {
        return this.IsShielded;
    }

    /**
     * Set <p>对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽</p>
     * @param IsShielded <p>对象是否被屏蔽，0表示未屏蔽，1表示被屏蔽</p>
     */
    public void setIsShielded(Long IsShielded) {
        this.IsShielded = IsShielded;
    }

    /**
     * Get <p>对象所在的地域</p> 
     * @return Region <p>对象所在的地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>对象所在的地域</p>
     * @param Region <p>对象所在的地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DescribeBindingPolicyObjectListInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindingPolicyObjectListInstance(DescribeBindingPolicyObjectListInstance source) {
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.IsShielded != null) {
            this.IsShielded = new Long(source.IsShielded);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
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

