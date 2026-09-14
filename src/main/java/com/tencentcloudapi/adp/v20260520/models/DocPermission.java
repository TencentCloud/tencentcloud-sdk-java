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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocPermission extends AbstractModel {

    /**
    * <p>是否可删除</p>
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * <p>是否可编辑</p>
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
    * <p>是否可重新生成</p>
    */
    @SerializedName("CanRestart")
    @Expose
    private Boolean CanRestart;

    /**
    * <p>是否可重试</p>
    */
    @SerializedName("CanRetry")
    @Expose
    private Boolean CanRetry;

    /**
     * Get <p>是否可删除</p> 
     * @return CanDelete <p>是否可删除</p>
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set <p>是否可删除</p>
     * @param CanDelete <p>是否可删除</p>
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get <p>是否可编辑</p> 
     * @return CanEdit <p>是否可编辑</p>
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set <p>是否可编辑</p>
     * @param CanEdit <p>是否可编辑</p>
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    /**
     * Get <p>是否可重新生成</p> 
     * @return CanRestart <p>是否可重新生成</p>
     */
    public Boolean getCanRestart() {
        return this.CanRestart;
    }

    /**
     * Set <p>是否可重新生成</p>
     * @param CanRestart <p>是否可重新生成</p>
     */
    public void setCanRestart(Boolean CanRestart) {
        this.CanRestart = CanRestart;
    }

    /**
     * Get <p>是否可重试</p> 
     * @return CanRetry <p>是否可重试</p>
     */
    public Boolean getCanRetry() {
        return this.CanRetry;
    }

    /**
     * Set <p>是否可重试</p>
     * @param CanRetry <p>是否可重试</p>
     */
    public void setCanRetry(Boolean CanRetry) {
        this.CanRetry = CanRetry;
    }

    public DocPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocPermission(DocPermission source) {
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
        if (source.CanRestart != null) {
            this.CanRestart = new Boolean(source.CanRestart);
        }
        if (source.CanRetry != null) {
            this.CanRetry = new Boolean(source.CanRetry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);
        this.setParamSimple(map, prefix + "CanRestart", this.CanRestart);
        this.setParamSimple(map, prefix + "CanRetry", this.CanRetry);

    }
}

