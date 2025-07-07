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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterConfigsHistory extends AbstractModel {

    /**
    * 计算组id
    */
    @SerializedName("ComputeGroupId")
    @Expose
    private String ComputeGroupId;

    /**
    * 配置文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 修改后的配置文件内容，base64编码
    */
    @SerializedName("NewConfValue")
    @Expose
    private String NewConfValue;

    /**
    * 修改前的配置文件内容，base64编码
    */
    @SerializedName("OldConfValue")
    @Expose
    private String OldConfValue;

    /**
    * 修改原因
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 修改子账号id
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
     * Get 计算组id 
     * @return ComputeGroupId 计算组id
     */
    public String getComputeGroupId() {
        return this.ComputeGroupId;
    }

    /**
     * Set 计算组id
     * @param ComputeGroupId 计算组id
     */
    public void setComputeGroupId(String ComputeGroupId) {
        this.ComputeGroupId = ComputeGroupId;
    }

    /**
     * Get 配置文件名称 
     * @return FileName 配置文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 配置文件名称
     * @param FileName 配置文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 修改后的配置文件内容，base64编码 
     * @return NewConfValue 修改后的配置文件内容，base64编码
     */
    public String getNewConfValue() {
        return this.NewConfValue;
    }

    /**
     * Set 修改后的配置文件内容，base64编码
     * @param NewConfValue 修改后的配置文件内容，base64编码
     */
    public void setNewConfValue(String NewConfValue) {
        this.NewConfValue = NewConfValue;
    }

    /**
     * Get 修改前的配置文件内容，base64编码 
     * @return OldConfValue 修改前的配置文件内容，base64编码
     */
    public String getOldConfValue() {
        return this.OldConfValue;
    }

    /**
     * Set 修改前的配置文件内容，base64编码
     * @param OldConfValue 修改前的配置文件内容，base64编码
     */
    public void setOldConfValue(String OldConfValue) {
        this.OldConfValue = OldConfValue;
    }

    /**
     * Get 修改原因 
     * @return Remark 修改原因
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 修改原因
     * @param Remark 修改原因
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 修改子账号id 
     * @return UserUin 修改子账号id
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 修改子账号id
     * @param UserUin 修改子账号id
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    public ClusterConfigsHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterConfigsHistory(ClusterConfigsHistory source) {
        if (source.ComputeGroupId != null) {
            this.ComputeGroupId = new String(source.ComputeGroupId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.NewConfValue != null) {
            this.NewConfValue = new String(source.NewConfValue);
        }
        if (source.OldConfValue != null) {
            this.OldConfValue = new String(source.OldConfValue);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComputeGroupId", this.ComputeGroupId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "NewConfValue", this.NewConfValue);
        this.setParamSimple(map, prefix + "OldConfValue", this.OldConfValue);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);

    }
}

