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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Package extends AbstractModel {

    /**
    * 资源包Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 资源包资源Id
    */
    @SerializedName("BizResourceId")
    @Expose
    private String BizResourceId;

    /**
    * 站点 中国站还是国际站
    */
    @SerializedName("Site")
    @Expose
    private String Site;

    /**
    * 资源包开始生效时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 资源包过期时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 资源包退费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundTime")
    @Expose
    private String RefundTime;

    /**
    * 资源包名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源包类型ID,对应点播：PackageId 对应直播：TypeId
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 资源包Id 
     * @return Id 资源包Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资源包Id
     * @param Id 资源包Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 资源包资源Id 
     * @return BizResourceId 资源包资源Id
     */
    public String getBizResourceId() {
        return this.BizResourceId;
    }

    /**
     * Set 资源包资源Id
     * @param BizResourceId 资源包资源Id
     */
    public void setBizResourceId(String BizResourceId) {
        this.BizResourceId = BizResourceId;
    }

    /**
     * Get 站点 中国站还是国际站 
     * @return Site 站点 中国站还是国际站
     */
    public String getSite() {
        return this.Site;
    }

    /**
     * Set 站点 中国站还是国际站
     * @param Site 站点 中国站还是国际站
     */
    public void setSite(String Site) {
        this.Site = Site;
    }

    /**
     * Get 资源包开始生效时间 
     * @return StartTime 资源包开始生效时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 资源包开始生效时间
     * @param StartTime 资源包开始生效时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 资源包过期时间 
     * @return EndTime 资源包过期时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 资源包过期时间
     * @param EndTime 资源包过期时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 资源包退费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundTime 资源包退费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundTime() {
        return this.RefundTime;
    }

    /**
     * Set 资源包退费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundTime 资源包退费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundTime(String RefundTime) {
        this.RefundTime = RefundTime;
    }

    /**
     * Get 资源包名称 
     * @return Name 资源包名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源包名称
     * @param Name 资源包名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源包类型ID,对应点播：PackageId 对应直播：TypeId 
     * @return Type 资源包类型ID,对应点播：PackageId 对应直播：TypeId
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源包类型ID,对应点播：PackageId 对应直播：TypeId
     * @param Type 资源包类型ID,对应点播：PackageId 对应直播：TypeId
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Package() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Package(Package source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.BizResourceId != null) {
            this.BizResourceId = new String(source.BizResourceId);
        }
        if (source.Site != null) {
            this.Site = new String(source.Site);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RefundTime != null) {
            this.RefundTime = new String(source.RefundTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BizResourceId", this.BizResourceId);
        this.setParamSimple(map, prefix + "Site", this.Site);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RefundTime", this.RefundTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

