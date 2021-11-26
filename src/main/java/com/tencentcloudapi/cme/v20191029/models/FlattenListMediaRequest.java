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

public class FlattenListMediaRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 媒体分类路径，例如填写"/a/b"，则代表平铺该分类路径下及其子分类路径下的媒体信息。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 媒体分类的归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10，最大值：50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以平铺查询任意分类下的媒体信息。如果指定操作者，则操作者必须对当前分类有读权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 媒体分类路径，例如填写"/a/b"，则代表平铺该分类路径下及其子分类路径下的媒体信息。 
     * @return ClassPath 媒体分类路径，例如填写"/a/b"，则代表平铺该分类路径下及其子分类路径下的媒体信息。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 媒体分类路径，例如填写"/a/b"，则代表平铺该分类路径下及其子分类路径下的媒体信息。
     * @param ClassPath 媒体分类路径，例如填写"/a/b"，则代表平铺该分类路径下及其子分类路径下的媒体信息。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 媒体分类的归属者。 
     * @return Owner 媒体分类的归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 媒体分类的归属者。
     * @param Owner 媒体分类的归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：10，最大值：50。 
     * @return Limit 返回记录条数，默认值：10，最大值：50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：50。
     * @param Limit 返回记录条数，默认值：10，最大值：50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以平铺查询任意分类下的媒体信息。如果指定操作者，则操作者必须对当前分类有读权限。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以平铺查询任意分类下的媒体信息。如果指定操作者，则操作者必须对当前分类有读权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以平铺查询任意分类下的媒体信息。如果指定操作者，则操作者必须对当前分类有读权限。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以平铺查询任意分类下的媒体信息。如果指定操作者，则操作者必须对当前分类有读权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public FlattenListMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlattenListMediaRequest(FlattenListMediaRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

