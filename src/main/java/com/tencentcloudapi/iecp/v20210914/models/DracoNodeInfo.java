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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DracoNodeInfo extends AbstractModel{

    /**
    * 设备SN。SN仅支持大写字母、数字，长度限制为1~32个字符
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 节点名称。长度限制为1~63个字符，节点名称只支持小写英文、数字、中横线、英文句号
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 设备SN。SN仅支持大写字母、数字，长度限制为1~32个字符 
     * @return SN 设备SN。SN仅支持大写字母、数字，长度限制为1~32个字符
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 设备SN。SN仅支持大写字母、数字，长度限制为1~32个字符
     * @param SN 设备SN。SN仅支持大写字母、数字，长度限制为1~32个字符
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 节点名称。长度限制为1~63个字符，节点名称只支持小写英文、数字、中横线、英文句号 
     * @return Name 节点名称。长度限制为1~63个字符，节点名称只支持小写英文、数字、中横线、英文句号
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名称。长度限制为1~63个字符，节点名称只支持小写英文、数字、中横线、英文句号
     * @param Name 节点名称。长度限制为1~63个字符，节点名称只支持小写英文、数字、中横线、英文句号
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点备注 
     * @return Remark 节点备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 节点备注
     * @param Remark 节点备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public DracoNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DracoNodeInfo(DracoNodeInfo source) {
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

