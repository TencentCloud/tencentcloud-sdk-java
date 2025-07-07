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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineGroupItem extends AbstractModel {

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 自定义线路分组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 自定义线路分组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义线路分组包含的线路
    */
    @SerializedName("Lines")
    @Expose
    private String [] Lines;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 自定义线路分组ID 
     * @return Id 自定义线路分组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 自定义线路分组ID
     * @param Id 自定义线路分组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 自定义线路分组名称 
     * @return Name 自定义线路分组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义线路分组名称
     * @param Name 自定义线路分组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义线路分组包含的线路 
     * @return Lines 自定义线路分组包含的线路
     */
    public String [] getLines() {
        return this.Lines;
    }

    /**
     * Set 自定义线路分组包含的线路
     * @param Lines 自定义线路分组包含的线路
     */
    public void setLines(String [] Lines) {
        this.Lines = Lines;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    public LineGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineGroupItem(LineGroupItem source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Lines != null) {
            this.Lines = new String[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new String(source.Lines[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Lines.", this.Lines);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);

    }
}

