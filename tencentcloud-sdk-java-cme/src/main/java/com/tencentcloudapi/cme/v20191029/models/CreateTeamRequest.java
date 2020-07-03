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

public class CreateTeamRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 团队名称，限30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 团队所有者，指定用户 ID。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 团队所有者的备注，限30个字符。
    */
    @SerializedName("OwnerRemark")
    @Expose
    private String OwnerRemark;

    /**
    * 自定义团队 ID。创建后不可修改，限20个英文字符及"-"。同时不能以 cmetid_开头。不填会生成默认团队 ID。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 团队名称，限30个字符。 
     * @return Name 团队名称，限30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 团队名称，限30个字符。
     * @param Name 团队名称，限30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 团队所有者，指定用户 ID。 
     * @return OwnerId 团队所有者，指定用户 ID。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 团队所有者，指定用户 ID。
     * @param OwnerId 团队所有者，指定用户 ID。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 团队所有者的备注，限30个字符。 
     * @return OwnerRemark 团队所有者的备注，限30个字符。
     */
    public String getOwnerRemark() {
        return this.OwnerRemark;
    }

    /**
     * Set 团队所有者的备注，限30个字符。
     * @param OwnerRemark 团队所有者的备注，限30个字符。
     */
    public void setOwnerRemark(String OwnerRemark) {
        this.OwnerRemark = OwnerRemark;
    }

    /**
     * Get 自定义团队 ID。创建后不可修改，限20个英文字符及"-"。同时不能以 cmetid_开头。不填会生成默认团队 ID。 
     * @return TeamId 自定义团队 ID。创建后不可修改，限20个英文字符及"-"。同时不能以 cmetid_开头。不填会生成默认团队 ID。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 自定义团队 ID。创建后不可修改，限20个英文字符及"-"。同时不能以 cmetid_开头。不填会生成默认团队 ID。
     * @param TeamId 自定义团队 ID。创建后不可修改，限20个英文字符及"-"。同时不能以 cmetid_开头。不填会生成默认团队 ID。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "OwnerRemark", this.OwnerRemark);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);

    }
}

