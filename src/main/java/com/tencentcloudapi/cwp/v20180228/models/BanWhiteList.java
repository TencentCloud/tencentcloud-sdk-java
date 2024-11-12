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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BanWhiteList extends AbstractModel {

    /**
    * 白名单ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 白名单别名。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 阻断来源IP。
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 修改白名单时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建白名单时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 白名单所属机器。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 白名单是否全局
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * 白名单所属机器列表
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 白名单ID。 
     * @return Id 白名单ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 白名单ID。
     * @param Id 白名单ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 白名单别名。 
     * @return Remark 白名单别名。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 白名单别名。
     * @param Remark 白名单别名。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 阻断来源IP。 
     * @return SrcIp 阻断来源IP。
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 阻断来源IP。
     * @param SrcIp 阻断来源IP。
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 修改白名单时间。 
     * @return ModifyTime 修改白名单时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改白名单时间。
     * @param ModifyTime 修改白名单时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建白名单时间。 
     * @return CreateTime 创建白名单时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建白名单时间。
     * @param CreateTime 创建白名单时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 白名单所属机器。 
     * @return Uuid 白名单所属机器。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 白名单所属机器。
     * @param Uuid 白名单所属机器。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 白名单是否全局 
     * @return IsGlobal 白名单是否全局
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 白名单是否全局
     * @param IsGlobal 白名单是否全局
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 白名单所属机器列表 
     * @return Quuids 白名单所属机器列表
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 白名单所属机器列表
     * @param Quuids 白名单所属机器列表
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public BanWhiteList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanWhiteList(BanWhiteList source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

