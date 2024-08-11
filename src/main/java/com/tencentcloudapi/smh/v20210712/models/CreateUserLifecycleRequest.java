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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserLifecycleRequest extends AbstractModel {

    /**
    * 媒体库 ID。
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 用于唯一查找用户的过滤器。
    */
    @SerializedName("Filter")
    @Expose
    private UserFilter Filter;

    /**
    * 隔离时间，当时间超过该时间点后，指定用户将无法登录，但他的账号信息、文件资源会被保留，可以通过再次调用本接口更新隔离时间，恢复登录。如不指定，则代表不设置隔离时间，且当前用户已经设置的隔离时间会被删除。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 销毁时间，当时间超过该时间点后，指定用户的资源将被销毁且无法通过再次调用此接口更新时间。如果同时指定了 IsolateTime 则不能早于 IsolateTime 指定的时间。如不指定，则代表不设置销毁时间，且当前用户已经设置的销毁时间会被删除。
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
     * Get 媒体库 ID。 
     * @return LibraryId 媒体库 ID。
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 媒体库 ID。
     * @param LibraryId 媒体库 ID。
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 用于唯一查找用户的过滤器。 
     * @return Filter 用于唯一查找用户的过滤器。
     */
    public UserFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 用于唯一查找用户的过滤器。
     * @param Filter 用于唯一查找用户的过滤器。
     */
    public void setFilter(UserFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 隔离时间，当时间超过该时间点后，指定用户将无法登录，但他的账号信息、文件资源会被保留，可以通过再次调用本接口更新隔离时间，恢复登录。如不指定，则代表不设置隔离时间，且当前用户已经设置的隔离时间会被删除。 
     * @return IsolateTime 隔离时间，当时间超过该时间点后，指定用户将无法登录，但他的账号信息、文件资源会被保留，可以通过再次调用本接口更新隔离时间，恢复登录。如不指定，则代表不设置隔离时间，且当前用户已经设置的隔离时间会被删除。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间，当时间超过该时间点后，指定用户将无法登录，但他的账号信息、文件资源会被保留，可以通过再次调用本接口更新隔离时间，恢复登录。如不指定，则代表不设置隔离时间，且当前用户已经设置的隔离时间会被删除。
     * @param IsolateTime 隔离时间，当时间超过该时间点后，指定用户将无法登录，但他的账号信息、文件资源会被保留，可以通过再次调用本接口更新隔离时间，恢复登录。如不指定，则代表不设置隔离时间，且当前用户已经设置的隔离时间会被删除。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 销毁时间，当时间超过该时间点后，指定用户的资源将被销毁且无法通过再次调用此接口更新时间。如果同时指定了 IsolateTime 则不能早于 IsolateTime 指定的时间。如不指定，则代表不设置销毁时间，且当前用户已经设置的销毁时间会被删除。 
     * @return DestroyTime 销毁时间，当时间超过该时间点后，指定用户的资源将被销毁且无法通过再次调用此接口更新时间。如果同时指定了 IsolateTime 则不能早于 IsolateTime 指定的时间。如不指定，则代表不设置销毁时间，且当前用户已经设置的销毁时间会被删除。
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set 销毁时间，当时间超过该时间点后，指定用户的资源将被销毁且无法通过再次调用此接口更新时间。如果同时指定了 IsolateTime 则不能早于 IsolateTime 指定的时间。如不指定，则代表不设置销毁时间，且当前用户已经设置的销毁时间会被删除。
     * @param DestroyTime 销毁时间，当时间超过该时间点后，指定用户的资源将被销毁且无法通过再次调用此接口更新时间。如果同时指定了 IsolateTime 则不能早于 IsolateTime 指定的时间。如不指定，则代表不设置销毁时间，且当前用户已经设置的销毁时间会被删除。
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    public CreateUserLifecycleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserLifecycleRequest(CreateUserLifecycleRequest source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.Filter != null) {
            this.Filter = new UserFilter(source.Filter);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);

    }
}

