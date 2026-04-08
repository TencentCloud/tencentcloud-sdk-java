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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveAvatarScriptsRequest extends AbstractModel {

    /**
    * <p>数字人直播间 ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>数字人直播间话术 ID。</p>
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * <p>分页查询的页数。</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * <p>分页查询的每页个数。</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>数字人该话术所属的产品 ID。</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
     * Get <p>数字人直播间 ID。</p> 
     * @return RoomId <p>数字人直播间 ID。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>数字人直播间 ID。</p>
     * @param RoomId <p>数字人直播间 ID。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>数字人直播间话术 ID。</p> 
     * @return ScriptId <p>数字人直播间话术 ID。</p>
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set <p>数字人直播间话术 ID。</p>
     * @param ScriptId <p>数字人直播间话术 ID。</p>
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get <p>分页查询的页数。</p> 
     * @return PageIndex <p>分页查询的页数。</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>分页查询的页数。</p>
     * @param PageIndex <p>分页查询的页数。</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get <p>分页查询的每页个数。</p> 
     * @return PageSize <p>分页查询的每页个数。</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页查询的每页个数。</p>
     * @param PageSize <p>分页查询的每页个数。</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>数字人该话术所属的产品 ID。</p> 
     * @return ProductId <p>数字人该话术所属的产品 ID。</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>数字人该话术所属的产品 ID。</p>
     * @param ProductId <p>数字人该话术所属的产品 ID。</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public DescribeLiveAvatarScriptsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveAvatarScriptsRequest(DescribeLiveAvatarScriptsRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

