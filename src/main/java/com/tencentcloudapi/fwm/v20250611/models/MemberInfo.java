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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberInfo extends AbstractModel {

    /**
    * <p>成员AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>成员Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>成员昵称</p>
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>成员Id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * <p>所属部门</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get <p>成员AppId</p> 
     * @return AppId <p>成员AppId</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>成员AppId</p>
     * @param AppId <p>成员AppId</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>成员Uin</p> 
     * @return Uin <p>成员Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>成员Uin</p>
     * @param Uin <p>成员Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>成员昵称</p> 
     * @return Nickname <p>成员昵称</p>
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>成员昵称</p>
     * @param Nickname <p>成员昵称</p>
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get <p>成员Id</p> 
     * @return MemberId <p>成员Id</p>
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>成员Id</p>
     * @param MemberId <p>成员Id</p>
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>所属部门</p> 
     * @return NodeName <p>所属部门</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>所属部门</p>
     * @param NodeName <p>所属部门</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public MemberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberInfo(MemberInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

