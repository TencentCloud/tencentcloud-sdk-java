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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginWhiteListsRule  extends AbstractModel{

    /**
    * 加白地域
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
    * 加白源IP，支持网段，多个IP以逗号隔开
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 加白用户名，多个用户名以逗号隔开
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 是否对全局生效
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * 白名单生效的机器
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 规则ID，用于更新规则
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
     * 获取加白地域
     * @return Places 加白地域
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * 设置加白地域
     * @param Places 加白地域
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    /**
     * 获取加白源IP，支持网段，多个IP以逗号隔开
     * @return SrcIp 加白源IP，支持网段，多个IP以逗号隔开
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * 设置加白源IP，支持网段，多个IP以逗号隔开
     * @param SrcIp 加白源IP，支持网段，多个IP以逗号隔开
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * 获取加白用户名，多个用户名以逗号隔开
     * @return UserName 加白用户名，多个用户名以逗号隔开
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置加白用户名，多个用户名以逗号隔开
     * @param UserName 加白用户名，多个用户名以逗号隔开
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取是否对全局生效
     * @return IsGlobal 是否对全局生效
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * 设置是否对全局生效
     * @param IsGlobal 是否对全局生效
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * 获取白名单生效的机器
     * @return HostIp 白名单生效的机器
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * 设置白名单生效的机器
     * @param HostIp 白名单生效的机器
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * 获取规则ID，用于更新规则
     * @return Id 规则ID，用于更新规则
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置规则ID，用于更新规则
     * @param Id 规则ID，用于更新规则
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

