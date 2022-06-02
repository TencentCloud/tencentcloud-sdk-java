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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdentifyZoneResponse extends AbstractModel{

    /**
    * 站点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子域
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * 记录类型
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 记录值
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 站点名称 
     * @return Name 站点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称
     * @param Name 站点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子域 
     * @return Subdomain 子域
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 子域
     * @param Subdomain 子域
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get 记录类型 
     * @return RecordType 记录类型
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型
     * @param RecordType 记录类型
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 记录值 
     * @return RecordValue 记录值
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set 记录值
     * @param RecordValue 记录值
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
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

    public IdentifyZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdentifyZoneResponse(IdentifyZoneResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

