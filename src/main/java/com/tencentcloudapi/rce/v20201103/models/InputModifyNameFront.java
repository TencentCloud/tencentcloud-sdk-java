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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputModifyNameFront extends AbstractModel {

    /**
    * 名单ID
    */
    @SerializedName("NameListId")
    @Expose
    private Long NameListId;

    /**
    * 名单名称
    */
    @SerializedName("ListName")
    @Expose
    private String ListName;

    /**
    * 名单状态 [1 启用 2 停用]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 名单ID 
     * @return NameListId 名单ID
     */
    public Long getNameListId() {
        return this.NameListId;
    }

    /**
     * Set 名单ID
     * @param NameListId 名单ID
     */
    public void setNameListId(Long NameListId) {
        this.NameListId = NameListId;
    }

    /**
     * Get 名单名称 
     * @return ListName 名单名称
     */
    public String getListName() {
        return this.ListName;
    }

    /**
     * Set 名单名称
     * @param ListName 名单名称
     */
    public void setListName(String ListName) {
        this.ListName = ListName;
    }

    /**
     * Get 名单状态 [1 启用 2 停用] 
     * @return Status 名单状态 [1 启用 2 停用]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 名单状态 [1 启用 2 停用]
     * @param Status 名单状态 [1 启用 2 停用]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 描述 
     * @return Remark 描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述
     * @param Remark 描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public InputModifyNameFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputModifyNameFront(InputModifyNameFront source) {
        if (source.NameListId != null) {
            this.NameListId = new Long(source.NameListId);
        }
        if (source.ListName != null) {
            this.ListName = new String(source.ListName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameListId", this.NameListId);
        this.setParamSimple(map, prefix + "ListName", this.ListName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

