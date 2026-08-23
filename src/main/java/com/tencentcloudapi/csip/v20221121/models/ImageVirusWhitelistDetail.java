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

public class ImageVirusWhitelistDetail extends AbstractModel {

    /**
    * <p>白名单规则id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>白名单所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>白名单所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>白名单所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>白名单生效范围</p><p>枚举值：</p><ul><li>1： 全部镜像</li><li>0： 指定镜像</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private Long [] ImageIds;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>木马白名单md5列表</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
     * Get <p>白名单规则id</p> 
     * @return RuleId <p>白名单规则id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>白名单规则id</p>
     * @param RuleId <p>白名单规则id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>白名单所属账号名</p> 
     * @return OwnerAccountName <p>白名单所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>白名单所属账号名</p>
     * @param OwnerAccountName <p>白名单所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>白名单所属账号uin</p> 
     * @return OwnerUin <p>白名单所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>白名单所属账号uin</p>
     * @param OwnerUin <p>白名单所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>白名单所属账号appid</p> 
     * @return OwnerAppId <p>白名单所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>白名单所属账号appid</p>
     * @param OwnerAppId <p>白名单所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>白名单生效范围</p><p>枚举值：</p><ul><li>1： 全部镜像</li><li>0： 指定镜像</li></ul> 
     * @return Scope <p>白名单生效范围</p><p>枚举值：</p><ul><li>1： 全部镜像</li><li>0： 指定镜像</li></ul>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>白名单生效范围</p><p>枚举值：</p><ul><li>1： 全部镜像</li><li>0： 指定镜像</li></ul>
     * @param Scope <p>白名单生效范围</p><p>枚举值：</p><ul><li>1： 全部镜像</li><li>0： 指定镜像</li></ul>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageIds <p>镜像id</p>
     */
    public Long [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageIds <p>镜像id</p>
     */
    public void setImageIds(Long [] ImageIds) {
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
     * Get <p>木马白名单md5列表</p> 
     * @return Md5List <p>木马白名单md5列表</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>木马白名单md5列表</p>
     * @param Md5List <p>木马白名单md5列表</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    public ImageVirusWhitelistDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVirusWhitelistDetail(ImageVirusWhitelistDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new Long[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new Long(source.ImageIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Md5List != null) {
            this.Md5List = new String[source.Md5List.length];
            for (int i = 0; i < source.Md5List.length; i++) {
                this.Md5List[i] = new String(source.Md5List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);

    }
}

