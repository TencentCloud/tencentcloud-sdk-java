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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGroupsForUserRequest extends AbstractModel {

    /**
    * 子用户 UID，入参Uid和SubUin二选一
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 每页数量。默认为20。
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 页码。默认为1。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 子账号UIN，入参Uid和SubUin二选一
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
     * Get 子用户 UID，入参Uid和SubUin二选一 
     * @return Uid 子用户 UID，入参Uid和SubUin二选一
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 子用户 UID，入参Uid和SubUin二选一
     * @param Uid 子用户 UID，入参Uid和SubUin二选一
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 每页数量。默认为20。 
     * @return Rp 每页数量。默认为20。
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set 每页数量。默认为20。
     * @param Rp 每页数量。默认为20。
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get 页码。默认为1。 
     * @return Page 页码。默认为1。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码。默认为1。
     * @param Page 页码。默认为1。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 子账号UIN，入参Uid和SubUin二选一 
     * @return SubUin 子账号UIN，入参Uid和SubUin二选一
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号UIN，入参Uid和SubUin二选一
     * @param SubUin 子账号UIN，入参Uid和SubUin二选一
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    public ListGroupsForUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGroupsForUserRequest(ListGroupsForUserRequest source) {
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);

    }
}

