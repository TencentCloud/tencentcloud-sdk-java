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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAndroidInstancesLabelsRequest extends AbstractModel {

    /**
    * 安卓实例 ID 列表
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 安卓实例标签列表
    */
    @SerializedName("AndroidInstanceLabels")
    @Expose
    private AndroidInstanceLabel [] AndroidInstanceLabels;

    /**
    * 操作类型。ADD：标签键不存在的添加新标签，标签键存在的将覆盖原有标签REMOVE：根据标签键删除标签REPLACE：使用请求标签列表替换原来所有标签CLEAR：清除所有标签
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 安卓实例 ID 列表 
     * @return AndroidInstanceIds 安卓实例 ID 列表
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 安卓实例 ID 列表
     * @param AndroidInstanceIds 安卓实例 ID 列表
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 安卓实例标签列表 
     * @return AndroidInstanceLabels 安卓实例标签列表
     */
    public AndroidInstanceLabel [] getAndroidInstanceLabels() {
        return this.AndroidInstanceLabels;
    }

    /**
     * Set 安卓实例标签列表
     * @param AndroidInstanceLabels 安卓实例标签列表
     */
    public void setAndroidInstanceLabels(AndroidInstanceLabel [] AndroidInstanceLabels) {
        this.AndroidInstanceLabels = AndroidInstanceLabels;
    }

    /**
     * Get 操作类型。ADD：标签键不存在的添加新标签，标签键存在的将覆盖原有标签REMOVE：根据标签键删除标签REPLACE：使用请求标签列表替换原来所有标签CLEAR：清除所有标签 
     * @return Operation 操作类型。ADD：标签键不存在的添加新标签，标签键存在的将覆盖原有标签REMOVE：根据标签键删除标签REPLACE：使用请求标签列表替换原来所有标签CLEAR：清除所有标签
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型。ADD：标签键不存在的添加新标签，标签键存在的将覆盖原有标签REMOVE：根据标签键删除标签REPLACE：使用请求标签列表替换原来所有标签CLEAR：清除所有标签
     * @param Operation 操作类型。ADD：标签键不存在的添加新标签，标签键存在的将覆盖原有标签REMOVE：根据标签键删除标签REPLACE：使用请求标签列表替换原来所有标签CLEAR：清除所有标签
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public ModifyAndroidInstancesLabelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidInstancesLabelsRequest(ModifyAndroidInstancesLabelsRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.AndroidInstanceLabels != null) {
            this.AndroidInstanceLabels = new AndroidInstanceLabel[source.AndroidInstanceLabels.length];
            for (int i = 0; i < source.AndroidInstanceLabels.length; i++) {
                this.AndroidInstanceLabels[i] = new AndroidInstanceLabel(source.AndroidInstanceLabels[i]);
            }
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamArrayObj(map, prefix + "AndroidInstanceLabels.", this.AndroidInstanceLabels);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

