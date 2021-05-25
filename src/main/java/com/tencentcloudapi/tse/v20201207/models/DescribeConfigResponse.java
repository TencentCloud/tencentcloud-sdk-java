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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigResponse extends AbstractModel{

    /**
    * 配置项或路径key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 配置项的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 当前key是否为路径
    */
    @SerializedName("IsDir")
    @Expose
    private Boolean IsDir;

    /**
    * 当前key下的子路径
    */
    @SerializedName("List")
    @Expose
    private String [] List;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 配置项或路径key 
     * @return Key 配置项或路径key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 配置项或路径key
     * @param Key 配置项或路径key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 配置项的值 
     * @return Value 配置项的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 配置项的值
     * @param Value 配置项的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 当前key是否为路径 
     * @return IsDir 当前key是否为路径
     */
    public Boolean getIsDir() {
        return this.IsDir;
    }

    /**
     * Set 当前key是否为路径
     * @param IsDir 当前key是否为路径
     */
    public void setIsDir(Boolean IsDir) {
        this.IsDir = IsDir;
    }

    /**
     * Get 当前key下的子路径 
     * @return List 当前key下的子路径
     */
    public String [] getList() {
        return this.List;
    }

    /**
     * Set 当前key下的子路径
     * @param List 当前key下的子路径
     */
    public void setList(String [] List) {
        this.List = List;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigResponse(DescribeConfigResponse source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.IsDir != null) {
            this.IsDir = new Boolean(source.IsDir);
        }
        if (source.List != null) {
            this.List = new String[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new String(source.List[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "IsDir", this.IsDir);
        this.setParamArraySimple(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

