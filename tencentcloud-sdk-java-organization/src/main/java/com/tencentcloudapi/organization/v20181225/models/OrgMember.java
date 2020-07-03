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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgMember extends AbstractModel{

    /**
    * UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 加入时间
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
     * Get UIN 
     * @return Uin UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set UIN
     * @param Uin UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

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
     * Get 加入时间 
     * @return JoinTime 加入时间
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set 加入时间
     * @param JoinTime 加入时间
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);

    }
}

