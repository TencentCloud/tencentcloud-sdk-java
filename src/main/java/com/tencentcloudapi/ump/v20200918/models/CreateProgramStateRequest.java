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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProgramStateRequest extends AbstractModel{

    /**
    * 集团编码
    */
    @SerializedName("GroupCode")
    @Expose
    private String GroupCode;

    /**
    * 进程监控信息列表
    */
    @SerializedName("ProgramStateItems")
    @Expose
    private ProgramStateItem [] ProgramStateItems;

    /**
    * 商场ID
    */
    @SerializedName("MallId")
    @Expose
    private Long MallId;

    /**
     * Get 集团编码 
     * @return GroupCode 集团编码
     */
    public String getGroupCode() {
        return this.GroupCode;
    }

    /**
     * Set 集团编码
     * @param GroupCode 集团编码
     */
    public void setGroupCode(String GroupCode) {
        this.GroupCode = GroupCode;
    }

    /**
     * Get 进程监控信息列表 
     * @return ProgramStateItems 进程监控信息列表
     */
    public ProgramStateItem [] getProgramStateItems() {
        return this.ProgramStateItems;
    }

    /**
     * Set 进程监控信息列表
     * @param ProgramStateItems 进程监控信息列表
     */
    public void setProgramStateItems(ProgramStateItem [] ProgramStateItems) {
        this.ProgramStateItems = ProgramStateItems;
    }

    /**
     * Get 商场ID 
     * @return MallId 商场ID
     */
    public Long getMallId() {
        return this.MallId;
    }

    /**
     * Set 商场ID
     * @param MallId 商场ID
     */
    public void setMallId(Long MallId) {
        this.MallId = MallId;
    }

    public CreateProgramStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProgramStateRequest(CreateProgramStateRequest source) {
        if (source.GroupCode != null) {
            this.GroupCode = new String(source.GroupCode);
        }
        if (source.ProgramStateItems != null) {
            this.ProgramStateItems = new ProgramStateItem[source.ProgramStateItems.length];
            for (int i = 0; i < source.ProgramStateItems.length; i++) {
                this.ProgramStateItems[i] = new ProgramStateItem(source.ProgramStateItems[i]);
            }
        }
        if (source.MallId != null) {
            this.MallId = new Long(source.MallId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupCode", this.GroupCode);
        this.setParamArrayObj(map, prefix + "ProgramStateItems.", this.ProgramStateItems);
        this.setParamSimple(map, prefix + "MallId", this.MallId);

    }
}

