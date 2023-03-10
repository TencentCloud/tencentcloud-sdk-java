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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcInfo extends AbstractModel{

    /**
    * 被抄送人手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 被抄送人姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 被抄送人类型,
0--个人
1--员工
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcType")
    @Expose
    private Long CcType;

    /**
    * 被抄送人权限
0--可查看
1--可查看也可下载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcPermission")
    @Expose
    private Long CcPermission;

    /**
     * Get 被抄送人手机号 
     * @return Mobile 被抄送人手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 被抄送人手机号
     * @param Mobile 被抄送人手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 被抄送人姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 被抄送人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 被抄送人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 被抄送人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 被抄送人类型,
0--个人
1--员工
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcType 被抄送人类型,
0--个人
1--员工
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCcType() {
        return this.CcType;
    }

    /**
     * Set 被抄送人类型,
0--个人
1--员工
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcType 被抄送人类型,
0--个人
1--员工
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcType(Long CcType) {
        this.CcType = CcType;
    }

    /**
     * Get 被抄送人权限
0--可查看
1--可查看也可下载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcPermission 被抄送人权限
0--可查看
1--可查看也可下载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCcPermission() {
        return this.CcPermission;
    }

    /**
     * Set 被抄送人权限
0--可查看
1--可查看也可下载
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcPermission 被抄送人权限
0--可查看
1--可查看也可下载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcPermission(Long CcPermission) {
        this.CcPermission = CcPermission;
    }

    public CcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcInfo(CcInfo source) {
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CcType != null) {
            this.CcType = new Long(source.CcType);
        }
        if (source.CcPermission != null) {
            this.CcPermission = new Long(source.CcPermission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CcType", this.CcType);
        this.setParamSimple(map, prefix + "CcPermission", this.CcPermission);

    }
}

