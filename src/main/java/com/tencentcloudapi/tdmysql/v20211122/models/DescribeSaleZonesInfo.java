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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSaleZonesInfo extends AbstractModel {

    /**
    * <p>Zone英文字符串</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Zone中文字符串</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>是否售卖，1：售卖；0：不售卖</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>是否是默认主可用区,0不是，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefaultMaster")
    @Expose
    private Long IsDefaultMaster;

    /**
    * <p>可用区可选磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableDiskTypes")
    @Expose
    private String [] AvailableDiskTypes;

    /**
    * <p>是否是独享可用区</p>
    */
    @SerializedName("SupportTypes")
    @Expose
    private String [] SupportTypes;

    /**
    * <p>是否支持serverless</p>
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Boolean IsSupportServerless;

    /**
     * Get <p>Zone英文字符串</p> 
     * @return Zone <p>Zone英文字符串</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Zone英文字符串</p>
     * @param Zone <p>Zone英文字符串</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Zone中文字符串</p> 
     * @return ZoneName <p>Zone中文字符串</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>Zone中文字符串</p>
     * @param ZoneName <p>Zone中文字符串</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>是否售卖，1：售卖；0：不售卖</p> 
     * @return Enable <p>是否售卖，1：售卖；0：不售卖</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否售卖，1：售卖；0：不售卖</p>
     * @param Enable <p>是否售卖，1：售卖；0：不售卖</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>是否是默认主可用区,0不是，1是</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefaultMaster <p>是否是默认主可用区,0不是，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefaultMaster() {
        return this.IsDefaultMaster;
    }

    /**
     * Set <p>是否是默认主可用区,0不是，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefaultMaster <p>是否是默认主可用区,0不是，1是</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefaultMaster(Long IsDefaultMaster) {
        this.IsDefaultMaster = IsDefaultMaster;
    }

    /**
     * Get <p>可用区可选磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableDiskTypes <p>可用区可选磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAvailableDiskTypes() {
        return this.AvailableDiskTypes;
    }

    /**
     * Set <p>可用区可选磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableDiskTypes <p>可用区可选磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableDiskTypes(String [] AvailableDiskTypes) {
        this.AvailableDiskTypes = AvailableDiskTypes;
    }

    /**
     * Get <p>是否是独享可用区</p> 
     * @return SupportTypes <p>是否是独享可用区</p>
     */
    public String [] getSupportTypes() {
        return this.SupportTypes;
    }

    /**
     * Set <p>是否是独享可用区</p>
     * @param SupportTypes <p>是否是独享可用区</p>
     */
    public void setSupportTypes(String [] SupportTypes) {
        this.SupportTypes = SupportTypes;
    }

    /**
     * Get <p>是否支持serverless</p> 
     * @return IsSupportServerless <p>是否支持serverless</p>
     */
    public Boolean getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set <p>是否支持serverless</p>
     * @param IsSupportServerless <p>是否支持serverless</p>
     */
    public void setIsSupportServerless(Boolean IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    public DescribeSaleZonesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSaleZonesInfo(DescribeSaleZonesInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.IsDefaultMaster != null) {
            this.IsDefaultMaster = new Long(source.IsDefaultMaster);
        }
        if (source.AvailableDiskTypes != null) {
            this.AvailableDiskTypes = new String[source.AvailableDiskTypes.length];
            for (int i = 0; i < source.AvailableDiskTypes.length; i++) {
                this.AvailableDiskTypes[i] = new String(source.AvailableDiskTypes[i]);
            }
        }
        if (source.SupportTypes != null) {
            this.SupportTypes = new String[source.SupportTypes.length];
            for (int i = 0; i < source.SupportTypes.length; i++) {
                this.SupportTypes[i] = new String(source.SupportTypes[i]);
            }
        }
        if (source.IsSupportServerless != null) {
            this.IsSupportServerless = new Boolean(source.IsSupportServerless);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "IsDefaultMaster", this.IsDefaultMaster);
        this.setParamArraySimple(map, prefix + "AvailableDiskTypes.", this.AvailableDiskTypes);
        this.setParamArraySimple(map, prefix + "SupportTypes.", this.SupportTypes);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);

    }
}

