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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAttributeLabelRequest extends AbstractModel {

    /**
    * 机器人ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 属性ID
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * 属性标识
    */
    @SerializedName("AttrKey")
    @Expose
    private String AttrKey;

    /**
    * 属性名称
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * 登录用户主账号(集成商模式必填)
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 登录用户子账号(集成商模式必填)
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * 删除的属性标签
    */
    @SerializedName("DeleteLabelBizIds")
    @Expose
    private String [] DeleteLabelBizIds;

    /**
    * 新增或编辑的属性标签
    */
    @SerializedName("Labels")
    @Expose
    private AttributeLabel [] Labels;

    /**
     * Get 机器人ID 
     * @return BotBizId 机器人ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 机器人ID
     * @param BotBizId 机器人ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 属性ID 
     * @return AttributeBizId 属性ID
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set 属性ID
     * @param AttributeBizId 属性ID
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get 属性标识 
     * @return AttrKey 属性标识
     */
    public String getAttrKey() {
        return this.AttrKey;
    }

    /**
     * Set 属性标识
     * @param AttrKey 属性标识
     */
    public void setAttrKey(String AttrKey) {
        this.AttrKey = AttrKey;
    }

    /**
     * Get 属性名称 
     * @return AttrName 属性名称
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set 属性名称
     * @param AttrName 属性名称
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get 登录用户主账号(集成商模式必填) 
     * @return LoginUin 登录用户主账号(集成商模式必填)
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 登录用户主账号(集成商模式必填)
     * @param LoginUin 登录用户主账号(集成商模式必填)
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get 登录用户子账号(集成商模式必填) 
     * @return LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 登录用户子账号(集成商模式必填)
     * @param LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get 删除的属性标签 
     * @return DeleteLabelBizIds 删除的属性标签
     */
    public String [] getDeleteLabelBizIds() {
        return this.DeleteLabelBizIds;
    }

    /**
     * Set 删除的属性标签
     * @param DeleteLabelBizIds 删除的属性标签
     */
    public void setDeleteLabelBizIds(String [] DeleteLabelBizIds) {
        this.DeleteLabelBizIds = DeleteLabelBizIds;
    }

    /**
     * Get 新增或编辑的属性标签 
     * @return Labels 新增或编辑的属性标签
     */
    public AttributeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 新增或编辑的属性标签
     * @param Labels 新增或编辑的属性标签
     */
    public void setLabels(AttributeLabel [] Labels) {
        this.Labels = Labels;
    }

    public ModifyAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAttributeLabelRequest(ModifyAttributeLabelRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.AttrKey != null) {
            this.AttrKey = new String(source.AttrKey);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.DeleteLabelBizIds != null) {
            this.DeleteLabelBizIds = new String[source.DeleteLabelBizIds.length];
            for (int i = 0; i < source.DeleteLabelBizIds.length; i++) {
                this.DeleteLabelBizIds[i] = new String(source.DeleteLabelBizIds[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new AttributeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AttributeLabel(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamSimple(map, prefix + "AttrKey", this.AttrKey);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamArraySimple(map, prefix + "DeleteLabelBizIds.", this.DeleteLabelBizIds);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

