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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectorGroup extends AbstractModel {

    /**
    * 线路组id GroupLineId
    */
    @SerializedName("Gid")
    @Expose
    private Long Gid;

    /**
    * bgp, international, isp
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * 组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * ipv4, ipv6
    */
    @SerializedName("InternetFamily")
    @Expose
    private String InternetFamily;

    /**
    * 支持的套餐类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageSet")
    @Expose
    private String [] PackageSet;

    /**
     * Get 线路组id GroupLineId 
     * @return Gid 线路组id GroupLineId
     */
    public Long getGid() {
        return this.Gid;
    }

    /**
     * Set 线路组id GroupLineId
     * @param Gid 线路组id GroupLineId
     */
    public void setGid(Long Gid) {
        this.Gid = Gid;
    }

    /**
     * Get bgp, international, isp 
     * @return GroupType bgp, international, isp
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set bgp, international, isp
     * @param GroupType bgp, international, isp
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 组名 
     * @return GroupName 组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 组名
     * @param GroupName 组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get ipv4, ipv6 
     * @return InternetFamily ipv4, ipv6
     */
    public String getInternetFamily() {
        return this.InternetFamily;
    }

    /**
     * Set ipv4, ipv6
     * @param InternetFamily ipv4, ipv6
     */
    public void setInternetFamily(String InternetFamily) {
        this.InternetFamily = InternetFamily;
    }

    /**
     * Get 支持的套餐类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageSet 支持的套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPackageSet() {
        return this.PackageSet;
    }

    /**
     * Set 支持的套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageSet 支持的套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageSet(String [] PackageSet) {
        this.PackageSet = PackageSet;
    }

    public DetectorGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectorGroup(DetectorGroup source) {
        if (source.Gid != null) {
            this.Gid = new Long(source.Gid);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InternetFamily != null) {
            this.InternetFamily = new String(source.InternetFamily);
        }
        if (source.PackageSet != null) {
            this.PackageSet = new String[source.PackageSet.length];
            for (int i = 0; i < source.PackageSet.length; i++) {
                this.PackageSet[i] = new String(source.PackageSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gid", this.Gid);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InternetFamily", this.InternetFamily);
        this.setParamArraySimple(map, prefix + "PackageSet.", this.PackageSet);

    }
}

