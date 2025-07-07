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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelVersionListRequest extends AbstractModel {

    /**
    * 型号类型，只支持传入 netDevice 和 server
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * model-name  型号名称  类型：String  必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 是否已评估
    */
    @SerializedName("Checked")
    @Expose
    private Boolean Checked;

    /**
    * 园区ID，当 Checked 参数传 True 时，该参数必须传值
    */
    @SerializedName("CampusId")
    @Expose
    private Long CampusId;

    /**
    * 型号关键字，可以实现模糊匹配搜索功能
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
     * Get 型号类型，只支持传入 netDevice 和 server 
     * @return DeviceType 型号类型，只支持传入 netDevice 和 server
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 型号类型，只支持传入 netDevice 和 server
     * @param DeviceType 型号类型，只支持传入 netDevice 和 server
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get model-name  型号名称  类型：String  必选：否 
     * @return Filters model-name  型号名称  类型：String  必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set model-name  型号名称  类型：String  必选：否
     * @param Filters model-name  型号名称  类型：String  必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否已评估 
     * @return Checked 是否已评估
     */
    public Boolean getChecked() {
        return this.Checked;
    }

    /**
     * Set 是否已评估
     * @param Checked 是否已评估
     */
    public void setChecked(Boolean Checked) {
        this.Checked = Checked;
    }

    /**
     * Get 园区ID，当 Checked 参数传 True 时，该参数必须传值 
     * @return CampusId 园区ID，当 Checked 参数传 True 时，该参数必须传值
     */
    public Long getCampusId() {
        return this.CampusId;
    }

    /**
     * Set 园区ID，当 Checked 参数传 True 时，该参数必须传值
     * @param CampusId 园区ID，当 Checked 参数传 True 时，该参数必须传值
     */
    public void setCampusId(Long CampusId) {
        this.CampusId = CampusId;
    }

    /**
     * Get 型号关键字，可以实现模糊匹配搜索功能 
     * @return ModelName 型号关键字，可以实现模糊匹配搜索功能
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 型号关键字，可以实现模糊匹配搜索功能
     * @param ModelName 型号关键字，可以实现模糊匹配搜索功能
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public DescribeModelVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelVersionListRequest(DescribeModelVersionListRequest source) {
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Checked != null) {
            this.Checked = new Boolean(source.Checked);
        }
        if (source.CampusId != null) {
            this.CampusId = new Long(source.CampusId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Checked", this.Checked);
        this.setParamSimple(map, prefix + "CampusId", this.CampusId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);

    }
}

