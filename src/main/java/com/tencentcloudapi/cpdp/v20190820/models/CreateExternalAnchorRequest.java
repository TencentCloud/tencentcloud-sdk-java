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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExternalAnchorRequest extends AbstractModel{

    /**
    * 平台业务系统唯一标示的主播id
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 主播名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证号
    */
    @SerializedName("IdNo")
    @Expose
    private String IdNo;

    /**
    * 身份证正面图片下载链接
    */
    @SerializedName("IdCardFront")
    @Expose
    private String IdCardFront;

    /**
    * 身份证反面图片下载链接
    */
    @SerializedName("IdCardReverse")
    @Expose
    private String IdCardReverse;

    /**
    * 指定分配的代理商ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
     * Get 平台业务系统唯一标示的主播id 
     * @return Uid 平台业务系统唯一标示的主播id
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 平台业务系统唯一标示的主播id
     * @param Uid 平台业务系统唯一标示的主播id
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 主播名称 
     * @return Name 主播名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 主播名称
     * @param Name 主播名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份证号 
     * @return IdNo 身份证号
     */
    public String getIdNo() {
        return this.IdNo;
    }

    /**
     * Set 身份证号
     * @param IdNo 身份证号
     */
    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    /**
     * Get 身份证正面图片下载链接 
     * @return IdCardFront 身份证正面图片下载链接
     */
    public String getIdCardFront() {
        return this.IdCardFront;
    }

    /**
     * Set 身份证正面图片下载链接
     * @param IdCardFront 身份证正面图片下载链接
     */
    public void setIdCardFront(String IdCardFront) {
        this.IdCardFront = IdCardFront;
    }

    /**
     * Get 身份证反面图片下载链接 
     * @return IdCardReverse 身份证反面图片下载链接
     */
    public String getIdCardReverse() {
        return this.IdCardReverse;
    }

    /**
     * Set 身份证反面图片下载链接
     * @param IdCardReverse 身份证反面图片下载链接
     */
    public void setIdCardReverse(String IdCardReverse) {
        this.IdCardReverse = IdCardReverse;
    }

    /**
     * Get 指定分配的代理商ID 
     * @return AgentId 指定分配的代理商ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 指定分配的代理商ID
     * @param AgentId 指定分配的代理商ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    public CreateExternalAnchorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExternalAnchorRequest(CreateExternalAnchorRequest source) {
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdNo != null) {
            this.IdNo = new String(source.IdNo);
        }
        if (source.IdCardFront != null) {
            this.IdCardFront = new String(source.IdCardFront);
        }
        if (source.IdCardReverse != null) {
            this.IdCardReverse = new String(source.IdCardReverse);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdNo", this.IdNo);
        this.setParamSimple(map, prefix + "IdCardFront", this.IdCardFront);
        this.setParamSimple(map, prefix + "IdCardReverse", this.IdCardReverse);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);

    }
}

