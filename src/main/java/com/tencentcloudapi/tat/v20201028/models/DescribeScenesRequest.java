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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScenesRequest extends AbstractModel {

    /**
    * 场景 ID 数组。

参数不支持同时指定 `SceneIds ` 和 `Filters ` 。

    */
    @SerializedName("SceneIds")
    @Expose
    private String [] SceneIds;

    /**
    * 过滤条件。

- scene-id - String - 是否必填：否 -（过滤条件）按照场景 ID 过滤。
- scene-name - String - 是否必填：否 -（过滤条件）按照场景名称过滤。
- created-by - String - 是否必填：否 -（过滤条件）按照场景创建者过滤，目前仅支持 TAT，代表公共场景。

每次请求的 `Filters` 的上限为10， `Filter.Values` 的上限为5。参数不支持同时指定 `SceneIds` 和 `Filters` 。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为20，最大值为100。关于 `Limit` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。关于 `Offset` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 场景 ID 数组。

参数不支持同时指定 `SceneIds ` 和 `Filters ` 。
 
     * @return SceneIds 场景 ID 数组。

参数不支持同时指定 `SceneIds ` 和 `Filters ` 。

     */
    public String [] getSceneIds() {
        return this.SceneIds;
    }

    /**
     * Set 场景 ID 数组。

参数不支持同时指定 `SceneIds ` 和 `Filters ` 。

     * @param SceneIds 场景 ID 数组。

参数不支持同时指定 `SceneIds ` 和 `Filters ` 。

     */
    public void setSceneIds(String [] SceneIds) {
        this.SceneIds = SceneIds;
    }

    /**
     * Get 过滤条件。

- scene-id - String - 是否必填：否 -（过滤条件）按照场景 ID 过滤。
- scene-name - String - 是否必填：否 -（过滤条件）按照场景名称过滤。
- created-by - String - 是否必填：否 -（过滤条件）按照场景创建者过滤，目前仅支持 TAT，代表公共场景。

每次请求的 `Filters` 的上限为10， `Filter.Values` 的上限为5。参数不支持同时指定 `SceneIds` 和 `Filters` 。 
     * @return Filters 过滤条件。

- scene-id - String - 是否必填：否 -（过滤条件）按照场景 ID 过滤。
- scene-name - String - 是否必填：否 -（过滤条件）按照场景名称过滤。
- created-by - String - 是否必填：否 -（过滤条件）按照场景创建者过滤，目前仅支持 TAT，代表公共场景。

每次请求的 `Filters` 的上限为10， `Filter.Values` 的上限为5。参数不支持同时指定 `SceneIds` 和 `Filters` 。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。

- scene-id - String - 是否必填：否 -（过滤条件）按照场景 ID 过滤。
- scene-name - String - 是否必填：否 -（过滤条件）按照场景名称过滤。
- created-by - String - 是否必填：否 -（过滤条件）按照场景创建者过滤，目前仅支持 TAT，代表公共场景。

每次请求的 `Filters` 的上限为10， `Filter.Values` 的上限为5。参数不支持同时指定 `SceneIds` 和 `Filters` 。
     * @param Filters 过滤条件。

- scene-id - String - 是否必填：否 -（过滤条件）按照场景 ID 过滤。
- scene-name - String - 是否必填：否 -（过滤条件）按照场景名称过滤。
- created-by - String - 是否必填：否 -（过滤条件）按照场景创建者过滤，目前仅支持 TAT，代表公共场景。

每次请求的 `Filters` 的上限为10， `Filter.Values` 的上限为5。参数不支持同时指定 `SceneIds` 和 `Filters` 。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于 `Limit` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于 `Limit` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于 `Limit` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于 `Limit` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。关于 `Offset` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于 `Offset` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于 `Offset` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于 `Offset` 的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeScenesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScenesRequest(DescribeScenesRequest source) {
        if (source.SceneIds != null) {
            this.SceneIds = new String[source.SceneIds.length];
            for (int i = 0; i < source.SceneIds.length; i++) {
                this.SceneIds[i] = new String(source.SceneIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SceneIds.", this.SceneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

