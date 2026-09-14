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

public class DeDuplicateStrategy extends AbstractModel {

    /**
    * <p>校验方式：1=按文档内容判断是否相同<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_COS_HASH</td><td>1</td><td>按文档内容（cos_hash）判断是否相同</td></tr></tbody></table></p>
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * <p>处理方式：1=返回报错，2=跳过并返回重复的文档 ID<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_RETURN_ERR</td><td>1</td><td>返回报错</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_SKIP</td><td>2</td><td>跳过，返回重复的文档 ID</td></tr></tbody></table></p>
    */
    @SerializedName("HandleType")
    @Expose
    private Long HandleType;

    /**
     * Get <p>校验方式：1=按文档内容判断是否相同<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_COS_HASH</td><td>1</td><td>按文档内容（cos_hash）判断是否相同</td></tr></tbody></table></p> 
     * @return CheckType <p>校验方式：1=按文档内容判断是否相同<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_COS_HASH</td><td>1</td><td>按文档内容（cos_hash）判断是否相同</td></tr></tbody></table></p>
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>校验方式：1=按文档内容判断是否相同<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_COS_HASH</td><td>1</td><td>按文档内容（cos_hash）判断是否相同</td></tr></tbody></table></p>
     * @param CheckType <p>校验方式：1=按文档内容判断是否相同<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_CHECK_TYPE_COS_HASH</td><td>1</td><td>按文档内容（cos_hash）判断是否相同</td></tr></tbody></table></p>
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>处理方式：1=返回报错，2=跳过并返回重复的文档 ID<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_RETURN_ERR</td><td>1</td><td>返回报错</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_SKIP</td><td>2</td><td>跳过，返回重复的文档 ID</td></tr></tbody></table></p> 
     * @return HandleType <p>处理方式：1=返回报错，2=跳过并返回重复的文档 ID<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_RETURN_ERR</td><td>1</td><td>返回报错</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_SKIP</td><td>2</td><td>跳过，返回重复的文档 ID</td></tr></tbody></table></p>
     */
    public Long getHandleType() {
        return this.HandleType;
    }

    /**
     * Set <p>处理方式：1=返回报错，2=跳过并返回重复的文档 ID<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_RETURN_ERR</td><td>1</td><td>返回报错</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_SKIP</td><td>2</td><td>跳过，返回重复的文档 ID</td></tr></tbody></table></p>
     * @param HandleType <p>处理方式：1=返回报错，2=跳过并返回重复的文档 ID<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_UNKNOWN</td><td>0</td><td>未知</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_RETURN_ERR</td><td>1</td><td>返回报错</td></tr><tr><td>DUPLICATE_FILE_HANDLE_TYPE_SKIP</td><td>2</td><td>跳过，返回重复的文档 ID</td></tr></tbody></table></p>
     */
    public void setHandleType(Long HandleType) {
        this.HandleType = HandleType;
    }

    public DeDuplicateStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeDuplicateStrategy(DeDuplicateStrategy source) {
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.HandleType != null) {
            this.HandleType = new Long(source.HandleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "HandleType", this.HandleType);

    }
}

