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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageVirusWhitelistRequest extends AbstractModel {

    /**
    * <p>木马白名单id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>木马白名单md5</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>白名单生效范围</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>生效白名单的镜像id列表</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>白名单名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>木马白名单id</p> 
     * @return RuleId <p>木马白名单id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>木马白名单id</p>
     * @param RuleId <p>木马白名单id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>木马白名单md5</p> 
     * @return Md5List <p>木马白名单md5</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>木马白名单md5</p>
     * @param Md5List <p>木马白名单md5</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>白名单生效范围</p> 
     * @return Scope <p>白名单生效范围</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>白名单生效范围</p>
     * @param Scope <p>白名单生效范围</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>生效白名单的镜像id列表</p> 
     * @return ImageIds <p>生效白名单的镜像id列表</p>
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>生效白名单的镜像id列表</p>
     * @param ImageIds <p>生效白名单的镜像id列表</p>
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul> 
     * @return Status <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     * @param Status <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>白名单名称</p> 
     * @return Name <p>白名单名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>白名单名称</p>
     * @param Name <p>白名单名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModifyImageVirusWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageVirusWhitelistRequest(ModifyImageVirusWhitelistRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Md5List != null) {
            this.Md5List = new String[source.Md5List.length];
            for (int i = 0; i < source.Md5List.length; i++) {
                this.Md5List[i] = new String(source.Md5List[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

