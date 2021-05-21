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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LockInfo extends AbstractModel{

    /**
    * 域名 ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 域名解锁码
    */
    @SerializedName("LockCode")
    @Expose
    private String LockCode;

    /**
    * 域名自动解锁日期
    */
    @SerializedName("LockEnd")
    @Expose
    private String LockEnd;

    /**
     * Get 域名 ID 
     * @return DomainId 域名 ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID
     * @param DomainId 域名 ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名解锁码 
     * @return LockCode 域名解锁码
     */
    public String getLockCode() {
        return this.LockCode;
    }

    /**
     * Set 域名解锁码
     * @param LockCode 域名解锁码
     */
    public void setLockCode(String LockCode) {
        this.LockCode = LockCode;
    }

    /**
     * Get 域名自动解锁日期 
     * @return LockEnd 域名自动解锁日期
     */
    public String getLockEnd() {
        return this.LockEnd;
    }

    /**
     * Set 域名自动解锁日期
     * @param LockEnd 域名自动解锁日期
     */
    public void setLockEnd(String LockEnd) {
        this.LockEnd = LockEnd;
    }

    public LockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LockInfo(LockInfo source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.LockCode != null) {
            this.LockCode = new String(source.LockCode);
        }
        if (source.LockEnd != null) {
            this.LockEnd = new String(source.LockEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "LockCode", this.LockCode);
        this.setParamSimple(map, prefix + "LockEnd", this.LockEnd);

    }
}

