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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListMediaResponse extends AbstractModel {

    /**
    * 符合条件的媒体记录总数。
    */
    @SerializedName("MaterialTotalCount")
    @Expose
    private Long MaterialTotalCount;

    /**
    * 浏览分类路径下的媒体列表信息。
    */
    @SerializedName("MaterialInfoSet")
    @Expose
    private MaterialInfo [] MaterialInfoSet;

    /**
    * 浏览分类路径下的一级子类。
    */
    @SerializedName("ClassInfoSet")
    @Expose
    private ClassInfo [] ClassInfoSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的媒体记录总数。 
     * @return MaterialTotalCount 符合条件的媒体记录总数。
     */
    public Long getMaterialTotalCount() {
        return this.MaterialTotalCount;
    }

    /**
     * Set 符合条件的媒体记录总数。
     * @param MaterialTotalCount 符合条件的媒体记录总数。
     */
    public void setMaterialTotalCount(Long MaterialTotalCount) {
        this.MaterialTotalCount = MaterialTotalCount;
    }

    /**
     * Get 浏览分类路径下的媒体列表信息。 
     * @return MaterialInfoSet 浏览分类路径下的媒体列表信息。
     */
    public MaterialInfo [] getMaterialInfoSet() {
        return this.MaterialInfoSet;
    }

    /**
     * Set 浏览分类路径下的媒体列表信息。
     * @param MaterialInfoSet 浏览分类路径下的媒体列表信息。
     */
    public void setMaterialInfoSet(MaterialInfo [] MaterialInfoSet) {
        this.MaterialInfoSet = MaterialInfoSet;
    }

    /**
     * Get 浏览分类路径下的一级子类。 
     * @return ClassInfoSet 浏览分类路径下的一级子类。
     */
    public ClassInfo [] getClassInfoSet() {
        return this.ClassInfoSet;
    }

    /**
     * Set 浏览分类路径下的一级子类。
     * @param ClassInfoSet 浏览分类路径下的一级子类。
     */
    public void setClassInfoSet(ClassInfo [] ClassInfoSet) {
        this.ClassInfoSet = ClassInfoSet;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListMediaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListMediaResponse(ListMediaResponse source) {
        if (source.MaterialTotalCount != null) {
            this.MaterialTotalCount = new Long(source.MaterialTotalCount);
        }
        if (source.MaterialInfoSet != null) {
            this.MaterialInfoSet = new MaterialInfo[source.MaterialInfoSet.length];
            for (int i = 0; i < source.MaterialInfoSet.length; i++) {
                this.MaterialInfoSet[i] = new MaterialInfo(source.MaterialInfoSet[i]);
            }
        }
        if (source.ClassInfoSet != null) {
            this.ClassInfoSet = new ClassInfo[source.ClassInfoSet.length];
            for (int i = 0; i < source.ClassInfoSet.length; i++) {
                this.ClassInfoSet[i] = new ClassInfo(source.ClassInfoSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialTotalCount", this.MaterialTotalCount);
        this.setParamArrayObj(map, prefix + "MaterialInfoSet.", this.MaterialInfoSet);
        this.setParamArrayObj(map, prefix + "ClassInfoSet.", this.ClassInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

