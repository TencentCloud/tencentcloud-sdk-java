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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectTypeConfigFields extends AbstractModel {

    /**
    * instanceId
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 实例id
    */
    @SerializedName("Header")
    @Expose
    private String Header;

    /**
    * 字段值是否需要转译，当不需要转译时，此字段返回null
    */
    @SerializedName("Transfer")
    @Expose
    private String Transfer;

    /**
    * tke的pod字段信息解析
    */
    @SerializedName("JsonParse")
    @Expose
    private String JsonParse;

    /**
    * 字段类型 0:str 1:list
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get instanceId 
     * @return Key instanceId
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set instanceId
     * @param Key instanceId
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 实例id 
     * @return Header 实例id
     */
    public String getHeader() {
        return this.Header;
    }

    /**
     * Set 实例id
     * @param Header 实例id
     */
    public void setHeader(String Header) {
        this.Header = Header;
    }

    /**
     * Get 字段值是否需要转译，当不需要转译时，此字段返回null 
     * @return Transfer 字段值是否需要转译，当不需要转译时，此字段返回null
     */
    public String getTransfer() {
        return this.Transfer;
    }

    /**
     * Set 字段值是否需要转译，当不需要转译时，此字段返回null
     * @param Transfer 字段值是否需要转译，当不需要转译时，此字段返回null
     */
    public void setTransfer(String Transfer) {
        this.Transfer = Transfer;
    }

    /**
     * Get tke的pod字段信息解析 
     * @return JsonParse tke的pod字段信息解析
     */
    public String getJsonParse() {
        return this.JsonParse;
    }

    /**
     * Set tke的pod字段信息解析
     * @param JsonParse tke的pod字段信息解析
     */
    public void setJsonParse(String JsonParse) {
        this.JsonParse = JsonParse;
    }

    /**
     * Get 字段类型 0:str 1:list 
     * @return Type 字段类型 0:str 1:list
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 字段类型 0:str 1:list
     * @param Type 字段类型 0:str 1:list
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ObjectTypeConfigFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectTypeConfigFields(ObjectTypeConfigFields source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Header != null) {
            this.Header = new String(source.Header);
        }
        if (source.Transfer != null) {
            this.Transfer = new String(source.Transfer);
        }
        if (source.JsonParse != null) {
            this.JsonParse = new String(source.JsonParse);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Header", this.Header);
        this.setParamSimple(map, prefix + "Transfer", this.Transfer);
        this.setParamSimple(map, prefix + "JsonParse", this.JsonParse);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

