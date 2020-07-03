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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkMaterial extends AbstractModel{

    /**
    * 链接类型取值:
<li>CLASS: 分类链接;</li>
<li> MATERIAL：素材链接。</li>
    */
    @SerializedName("LinkType")
    @Expose
    private String LinkType;

    /**
    * 链接状态取值：
<li> Normal：正常 ；</li>
<li>NotFound：链接目标不存在；</li> <li>Forbidden：无权限。</li>
    */
    @SerializedName("LinkStatus")
    @Expose
    private String LinkStatus;

    /**
    * 素材链接详细信息，当LinkType="MATERIAL"时有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkMaterialInfo")
    @Expose
    private LinkMaterialInfo LinkMaterialInfo;

    /**
    * 分类链接目标信息，当LinkType=“CLASS”时有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkClassInfo")
    @Expose
    private ClassInfo LinkClassInfo;

    /**
     * Get 链接类型取值:
<li>CLASS: 分类链接;</li>
<li> MATERIAL：素材链接。</li> 
     * @return LinkType 链接类型取值:
<li>CLASS: 分类链接;</li>
<li> MATERIAL：素材链接。</li>
     */
    public String getLinkType() {
        return this.LinkType;
    }

    /**
     * Set 链接类型取值:
<li>CLASS: 分类链接;</li>
<li> MATERIAL：素材链接。</li>
     * @param LinkType 链接类型取值:
<li>CLASS: 分类链接;</li>
<li> MATERIAL：素材链接。</li>
     */
    public void setLinkType(String LinkType) {
        this.LinkType = LinkType;
    }

    /**
     * Get 链接状态取值：
<li> Normal：正常 ；</li>
<li>NotFound：链接目标不存在；</li> <li>Forbidden：无权限。</li> 
     * @return LinkStatus 链接状态取值：
<li> Normal：正常 ；</li>
<li>NotFound：链接目标不存在；</li> <li>Forbidden：无权限。</li>
     */
    public String getLinkStatus() {
        return this.LinkStatus;
    }

    /**
     * Set 链接状态取值：
<li> Normal：正常 ；</li>
<li>NotFound：链接目标不存在；</li> <li>Forbidden：无权限。</li>
     * @param LinkStatus 链接状态取值：
<li> Normal：正常 ；</li>
<li>NotFound：链接目标不存在；</li> <li>Forbidden：无权限。</li>
     */
    public void setLinkStatus(String LinkStatus) {
        this.LinkStatus = LinkStatus;
    }

    /**
     * Get 素材链接详细信息，当LinkType="MATERIAL"时有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkMaterialInfo 素材链接详细信息，当LinkType="MATERIAL"时有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LinkMaterialInfo getLinkMaterialInfo() {
        return this.LinkMaterialInfo;
    }

    /**
     * Set 素材链接详细信息，当LinkType="MATERIAL"时有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkMaterialInfo 素材链接详细信息，当LinkType="MATERIAL"时有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkMaterialInfo(LinkMaterialInfo LinkMaterialInfo) {
        this.LinkMaterialInfo = LinkMaterialInfo;
    }

    /**
     * Get 分类链接目标信息，当LinkType=“CLASS”时有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkClassInfo 分类链接目标信息，当LinkType=“CLASS”时有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassInfo getLinkClassInfo() {
        return this.LinkClassInfo;
    }

    /**
     * Set 分类链接目标信息，当LinkType=“CLASS”时有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkClassInfo 分类链接目标信息，当LinkType=“CLASS”时有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkClassInfo(ClassInfo LinkClassInfo) {
        this.LinkClassInfo = LinkClassInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinkType", this.LinkType);
        this.setParamSimple(map, prefix + "LinkStatus", this.LinkStatus);
        this.setParamObj(map, prefix + "LinkMaterialInfo.", this.LinkMaterialInfo);
        this.setParamObj(map, prefix + "LinkClassInfo.", this.LinkClassInfo);

    }
}

