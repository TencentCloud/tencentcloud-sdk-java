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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel {

    /**
    * 集群实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 密码
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * 用户链接来自的 IP
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
    * 修改前用户链接来自的 IP
    */
    @SerializedName("OldWhiteHost")
    @Expose
    private String OldWhiteHost;

    /**
    * 描述
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 旧密码
    */
    @SerializedName("OldPwd")
    @Expose
    private String OldPwd;

    /**
    * 绑定的子用户uin
    */
    @SerializedName("CamUin")
    @Expose
    private String CamUin;

    /**
    * ranger group id列表
    */
    @SerializedName("CamRangerGroupIds")
    @Expose
    private Long [] CamRangerGroupIds;

    /**
     * Get 集群实例id 
     * @return InstanceId 集群实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例id
     * @param InstanceId 集群实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 密码 
     * @return PassWord 密码
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set 密码
     * @param PassWord 密码
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get 用户链接来自的 IP 
     * @return WhiteHost 用户链接来自的 IP
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set 用户链接来自的 IP
     * @param WhiteHost 用户链接来自的 IP
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    /**
     * Get 修改前用户链接来自的 IP 
     * @return OldWhiteHost 修改前用户链接来自的 IP
     */
    public String getOldWhiteHost() {
        return this.OldWhiteHost;
    }

    /**
     * Set 修改前用户链接来自的 IP
     * @param OldWhiteHost 修改前用户链接来自的 IP
     */
    public void setOldWhiteHost(String OldWhiteHost) {
        this.OldWhiteHost = OldWhiteHost;
    }

    /**
     * Get 描述 
     * @return Describe 描述
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 描述
     * @param Describe 描述
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 旧密码 
     * @return OldPwd 旧密码
     */
    public String getOldPwd() {
        return this.OldPwd;
    }

    /**
     * Set 旧密码
     * @param OldPwd 旧密码
     */
    public void setOldPwd(String OldPwd) {
        this.OldPwd = OldPwd;
    }

    /**
     * Get 绑定的子用户uin 
     * @return CamUin 绑定的子用户uin
     */
    public String getCamUin() {
        return this.CamUin;
    }

    /**
     * Set 绑定的子用户uin
     * @param CamUin 绑定的子用户uin
     */
    public void setCamUin(String CamUin) {
        this.CamUin = CamUin;
    }

    /**
     * Get ranger group id列表 
     * @return CamRangerGroupIds ranger group id列表
     */
    public Long [] getCamRangerGroupIds() {
        return this.CamRangerGroupIds;
    }

    /**
     * Set ranger group id列表
     * @param CamRangerGroupIds ranger group id列表
     */
    public void setCamRangerGroupIds(Long [] CamRangerGroupIds) {
        this.CamRangerGroupIds = CamRangerGroupIds;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
        if (source.OldWhiteHost != null) {
            this.OldWhiteHost = new String(source.OldWhiteHost);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.OldPwd != null) {
            this.OldPwd = new String(source.OldPwd);
        }
        if (source.CamUin != null) {
            this.CamUin = new String(source.CamUin);
        }
        if (source.CamRangerGroupIds != null) {
            this.CamRangerGroupIds = new Long[source.CamRangerGroupIds.length];
            for (int i = 0; i < source.CamRangerGroupIds.length; i++) {
                this.CamRangerGroupIds[i] = new Long(source.CamRangerGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);
        this.setParamSimple(map, prefix + "OldWhiteHost", this.OldWhiteHost);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "OldPwd", this.OldPwd);
        this.setParamSimple(map, prefix + "CamUin", this.CamUin);
        this.setParamArraySimple(map, prefix + "CamRangerGroupIds.", this.CamRangerGroupIds);

    }
}

