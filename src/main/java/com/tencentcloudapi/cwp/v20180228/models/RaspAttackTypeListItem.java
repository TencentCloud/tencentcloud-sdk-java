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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspAttackTypeListItem extends AbstractModel {

    /**
    * 攻击类型名称
    */
    @SerializedName("AttackTypeName")
    @Expose
    private String AttackTypeName;

    /**
    * 攻击类型ID
    */
    @SerializedName("AttackTypeID")
    @Expose
    private Long AttackTypeID;

    /**
    * 漏洞对应的功能类型，rasp:漏洞防御,memshell_inject:内存马注入
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 攻击类型名称 
     * @return AttackTypeName 攻击类型名称
     */
    public String getAttackTypeName() {
        return this.AttackTypeName;
    }

    /**
     * Set 攻击类型名称
     * @param AttackTypeName 攻击类型名称
     */
    public void setAttackTypeName(String AttackTypeName) {
        this.AttackTypeName = AttackTypeName;
    }

    /**
     * Get 攻击类型ID 
     * @return AttackTypeID 攻击类型ID
     */
    public Long getAttackTypeID() {
        return this.AttackTypeID;
    }

    /**
     * Set 攻击类型ID
     * @param AttackTypeID 攻击类型ID
     */
    public void setAttackTypeID(Long AttackTypeID) {
        this.AttackTypeID = AttackTypeID;
    }

    /**
     * Get 漏洞对应的功能类型，rasp:漏洞防御,memshell_inject:内存马注入 
     * @return Source 漏洞对应的功能类型，rasp:漏洞防御,memshell_inject:内存马注入
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 漏洞对应的功能类型，rasp:漏洞防御,memshell_inject:内存马注入
     * @param Source 漏洞对应的功能类型，rasp:漏洞防御,memshell_inject:内存马注入
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public RaspAttackTypeListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspAttackTypeListItem(RaspAttackTypeListItem source) {
        if (source.AttackTypeName != null) {
            this.AttackTypeName = new String(source.AttackTypeName);
        }
        if (source.AttackTypeID != null) {
            this.AttackTypeID = new Long(source.AttackTypeID);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackTypeName", this.AttackTypeName);
        this.setParamSimple(map, prefix + "AttackTypeID", this.AttackTypeID);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

