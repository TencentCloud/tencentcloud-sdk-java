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

public class CosAccessInfo extends AbstractModel {

    /**
    * 可访问账号uin
    */
    @SerializedName("AccessUin")
    @Expose
    private String AccessUin;

    /**
    * 可访问账号uid
    */
    @SerializedName("AccessUid")
    @Expose
    private String AccessUid;

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 身份标识 
1 主账号
2 子账号
    */
    @SerializedName("Identity")
    @Expose
    private Long Identity;

    /**
    * 所属主账号名称
    */
    @SerializedName("MainNickName")
    @Expose
    private String MainNickName;

    /**
    * 可访问ak列表
    */
    @SerializedName("AkList")
    @Expose
    private String [] AkList;

    /**
    * 可访问权限数
    */
    @SerializedName("CamPolicyCount")
    @Expose
    private Long CamPolicyCount;

    /**
    * 修改时间Unix时间单位毫秒
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 可访问账号uin 
     * @return AccessUin 可访问账号uin
     */
    public String getAccessUin() {
        return this.AccessUin;
    }

    /**
     * Set 可访问账号uin
     * @param AccessUin 可访问账号uin
     */
    public void setAccessUin(String AccessUin) {
        this.AccessUin = AccessUin;
    }

    /**
     * Get 可访问账号uid 
     * @return AccessUid 可访问账号uid
     */
    public String getAccessUid() {
        return this.AccessUid;
    }

    /**
     * Set 可访问账号uid
     * @param AccessUid 可访问账号uid
     */
    public void setAccessUid(String AccessUid) {
        this.AccessUid = AccessUid;
    }

    /**
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 身份标识 
1 主账号
2 子账号 
     * @return Identity 身份标识 
1 主账号
2 子账号
     */
    public Long getIdentity() {
        return this.Identity;
    }

    /**
     * Set 身份标识 
1 主账号
2 子账号
     * @param Identity 身份标识 
1 主账号
2 子账号
     */
    public void setIdentity(Long Identity) {
        this.Identity = Identity;
    }

    /**
     * Get 所属主账号名称 
     * @return MainNickName 所属主账号名称
     */
    public String getMainNickName() {
        return this.MainNickName;
    }

    /**
     * Set 所属主账号名称
     * @param MainNickName 所属主账号名称
     */
    public void setMainNickName(String MainNickName) {
        this.MainNickName = MainNickName;
    }

    /**
     * Get 可访问ak列表 
     * @return AkList 可访问ak列表
     */
    public String [] getAkList() {
        return this.AkList;
    }

    /**
     * Set 可访问ak列表
     * @param AkList 可访问ak列表
     */
    public void setAkList(String [] AkList) {
        this.AkList = AkList;
    }

    /**
     * Get 可访问权限数 
     * @return CamPolicyCount 可访问权限数
     */
    public Long getCamPolicyCount() {
        return this.CamPolicyCount;
    }

    /**
     * Set 可访问权限数
     * @param CamPolicyCount 可访问权限数
     */
    public void setCamPolicyCount(Long CamPolicyCount) {
        this.CamPolicyCount = CamPolicyCount;
    }

    /**
     * Get 修改时间Unix时间单位毫秒 
     * @return UpdateTime 修改时间Unix时间单位毫秒
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间Unix时间单位毫秒
     * @param UpdateTime 修改时间Unix时间单位毫秒
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CosAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAccessInfo(CosAccessInfo source) {
        if (source.AccessUin != null) {
            this.AccessUin = new String(source.AccessUin);
        }
        if (source.AccessUid != null) {
            this.AccessUid = new String(source.AccessUid);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Identity != null) {
            this.Identity = new Long(source.Identity);
        }
        if (source.MainNickName != null) {
            this.MainNickName = new String(source.MainNickName);
        }
        if (source.AkList != null) {
            this.AkList = new String[source.AkList.length];
            for (int i = 0; i < source.AkList.length; i++) {
                this.AkList[i] = new String(source.AkList[i]);
            }
        }
        if (source.CamPolicyCount != null) {
            this.CamPolicyCount = new Long(source.CamPolicyCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessUin", this.AccessUin);
        this.setParamSimple(map, prefix + "AccessUid", this.AccessUid);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Identity", this.Identity);
        this.setParamSimple(map, prefix + "MainNickName", this.MainNickName);
        this.setParamArraySimple(map, prefix + "AkList.", this.AkList);
        this.setParamSimple(map, prefix + "CamPolicyCount", this.CamPolicyCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

