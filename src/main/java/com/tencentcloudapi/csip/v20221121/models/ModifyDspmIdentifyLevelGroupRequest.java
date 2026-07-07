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

public class ModifyDspmIdentifyLevelGroupRequest extends AbstractModel {

    /**
    * <p>级别组id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>级别组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>级别组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>级别信息</p>
    */
    @SerializedName("LevelItems")
    @Expose
    private DspmIdentifyLevelItem [] LevelItems;

    /**
     * Get <p>级别组id</p> 
     * @return Id <p>级别组id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>级别组id</p>
     * @param Id <p>级别组id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>级别组名称</p> 
     * @return Name <p>级别组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>级别组名称</p>
     * @param Name <p>级别组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>级别组描述</p> 
     * @return Description <p>级别组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>级别组描述</p>
     * @param Description <p>级别组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>级别信息</p> 
     * @return LevelItems <p>级别信息</p>
     */
    public DspmIdentifyLevelItem [] getLevelItems() {
        return this.LevelItems;
    }

    /**
     * Set <p>级别信息</p>
     * @param LevelItems <p>级别信息</p>
     */
    public void setLevelItems(DspmIdentifyLevelItem [] LevelItems) {
        this.LevelItems = LevelItems;
    }

    public ModifyDspmIdentifyLevelGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmIdentifyLevelGroupRequest(ModifyDspmIdentifyLevelGroupRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LevelItems != null) {
            this.LevelItems = new DspmIdentifyLevelItem[source.LevelItems.length];
            for (int i = 0; i < source.LevelItems.length; i++) {
                this.LevelItems[i] = new DspmIdentifyLevelItem(source.LevelItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "LevelItems.", this.LevelItems);

    }
}

