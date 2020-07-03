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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveDomainRequest extends AbstractModel{

    /**
    * 要删除的域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 类型。0-推流，1-播放
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get 要删除的域名 
     * @return DomainName 要删除的域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 要删除的域名
     * @param DomainName 要删除的域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 类型。0-推流，1-播放 
     * @return DomainType 类型。0-推流，1-播放
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set 类型。0-推流，1-播放
     * @param DomainType 类型。0-推流，1-播放
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);

    }
}

