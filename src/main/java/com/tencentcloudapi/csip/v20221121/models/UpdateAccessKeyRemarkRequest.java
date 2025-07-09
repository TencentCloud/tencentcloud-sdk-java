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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAccessKeyRemarkRequest extends AbstractModel {

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 源IP 名称
    */
    @SerializedName("SourceIPList")
    @Expose
    private String [] SourceIPList;

    /**
    * ak名称
    */
    @SerializedName("AccessKeyList")
    @Expose
    private String [] AccessKeyList;

    /**
    * 源IP的ID
    */
    @SerializedName("SourceIPIDList")
    @Expose
    private Long [] SourceIPIDList;

    /**
    * AK的ID
    */
    @SerializedName("AccessKeyIDList")
    @Expose
    private Long [] AccessKeyIDList;

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 源IP 名称 
     * @return SourceIPList 源IP 名称
     */
    public String [] getSourceIPList() {
        return this.SourceIPList;
    }

    /**
     * Set 源IP 名称
     * @param SourceIPList 源IP 名称
     */
    public void setSourceIPList(String [] SourceIPList) {
        this.SourceIPList = SourceIPList;
    }

    /**
     * Get ak名称 
     * @return AccessKeyList ak名称
     */
    public String [] getAccessKeyList() {
        return this.AccessKeyList;
    }

    /**
     * Set ak名称
     * @param AccessKeyList ak名称
     */
    public void setAccessKeyList(String [] AccessKeyList) {
        this.AccessKeyList = AccessKeyList;
    }

    /**
     * Get 源IP的ID 
     * @return SourceIPIDList 源IP的ID
     */
    public Long [] getSourceIPIDList() {
        return this.SourceIPIDList;
    }

    /**
     * Set 源IP的ID
     * @param SourceIPIDList 源IP的ID
     */
    public void setSourceIPIDList(Long [] SourceIPIDList) {
        this.SourceIPIDList = SourceIPIDList;
    }

    /**
     * Get AK的ID 
     * @return AccessKeyIDList AK的ID
     */
    public Long [] getAccessKeyIDList() {
        return this.AccessKeyIDList;
    }

    /**
     * Set AK的ID
     * @param AccessKeyIDList AK的ID
     */
    public void setAccessKeyIDList(Long [] AccessKeyIDList) {
        this.AccessKeyIDList = AccessKeyIDList;
    }

    public UpdateAccessKeyRemarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAccessKeyRemarkRequest(UpdateAccessKeyRemarkRequest source) {
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.SourceIPList != null) {
            this.SourceIPList = new String[source.SourceIPList.length];
            for (int i = 0; i < source.SourceIPList.length; i++) {
                this.SourceIPList[i] = new String(source.SourceIPList[i]);
            }
        }
        if (source.AccessKeyList != null) {
            this.AccessKeyList = new String[source.AccessKeyList.length];
            for (int i = 0; i < source.AccessKeyList.length; i++) {
                this.AccessKeyList[i] = new String(source.AccessKeyList[i]);
            }
        }
        if (source.SourceIPIDList != null) {
            this.SourceIPIDList = new Long[source.SourceIPIDList.length];
            for (int i = 0; i < source.SourceIPIDList.length; i++) {
                this.SourceIPIDList[i] = new Long(source.SourceIPIDList[i]);
            }
        }
        if (source.AccessKeyIDList != null) {
            this.AccessKeyIDList = new Long[source.AccessKeyIDList.length];
            for (int i = 0; i < source.AccessKeyIDList.length; i++) {
                this.AccessKeyIDList[i] = new Long(source.AccessKeyIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "SourceIPList.", this.SourceIPList);
        this.setParamArraySimple(map, prefix + "AccessKeyList.", this.AccessKeyList);
        this.setParamArraySimple(map, prefix + "SourceIPIDList.", this.SourceIPIDList);
        this.setParamArraySimple(map, prefix + "AccessKeyIDList.", this.AccessKeyIDList);

    }
}

