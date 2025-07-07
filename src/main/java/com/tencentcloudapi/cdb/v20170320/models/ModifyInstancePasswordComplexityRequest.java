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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancePasswordComplexityRequest extends AbstractModel {

    /**
    * 要修改密码复杂度的实例 ID。
说明：支持输入多个实例 ID 进行修改。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 要修改的密码复杂度的选项。每一个选项是以组合形式写入的，一个组合包括 Name 和 CurrentValue，其中 Name 表示对应选项的参数名，CurrentValue 表示参数值。例如：[{"Name": "validate_password.length", "CurrentValue": "10"}]，表示将密码的最小字符数修改为10。
说明：不同数据库版本的实例，支持修改的密码复杂度的选项如下。
1. MySQL 8.0：
选项 validate_password.policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password.length，表示密码总长度的最小字符数。
选项 validate_password.mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password.number_count，表示数字的最小字符数。
选项 validate_password.special_char_count，表示特殊字符的最小字符数。
2. MySQL 5.6、MySQL 5.7：
选项 validate_password_policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password_length，表示密码总长度的最小字符数。
选项 validate_password_mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password_number_count，表示数字的最小字符数。
选项 validate_password_special_char_count，表示特殊字符的最小字符数。
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
     * Get 要修改密码复杂度的实例 ID。
说明：支持输入多个实例 ID 进行修改。 
     * @return InstanceIds 要修改密码复杂度的实例 ID。
说明：支持输入多个实例 ID 进行修改。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 要修改密码复杂度的实例 ID。
说明：支持输入多个实例 ID 进行修改。
     * @param InstanceIds 要修改密码复杂度的实例 ID。
说明：支持输入多个实例 ID 进行修改。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 要修改的密码复杂度的选项。每一个选项是以组合形式写入的，一个组合包括 Name 和 CurrentValue，其中 Name 表示对应选项的参数名，CurrentValue 表示参数值。例如：[{"Name": "validate_password.length", "CurrentValue": "10"}]，表示将密码的最小字符数修改为10。
说明：不同数据库版本的实例，支持修改的密码复杂度的选项如下。
1. MySQL 8.0：
选项 validate_password.policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password.length，表示密码总长度的最小字符数。
选项 validate_password.mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password.number_count，表示数字的最小字符数。
选项 validate_password.special_char_count，表示特殊字符的最小字符数。
2. MySQL 5.6、MySQL 5.7：
选项 validate_password_policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password_length，表示密码总长度的最小字符数。
选项 validate_password_mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password_number_count，表示数字的最小字符数。
选项 validate_password_special_char_count，表示特殊字符的最小字符数。 
     * @return ParamList 要修改的密码复杂度的选项。每一个选项是以组合形式写入的，一个组合包括 Name 和 CurrentValue，其中 Name 表示对应选项的参数名，CurrentValue 表示参数值。例如：[{"Name": "validate_password.length", "CurrentValue": "10"}]，表示将密码的最小字符数修改为10。
说明：不同数据库版本的实例，支持修改的密码复杂度的选项如下。
1. MySQL 8.0：
选项 validate_password.policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password.length，表示密码总长度的最小字符数。
选项 validate_password.mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password.number_count，表示数字的最小字符数。
选项 validate_password.special_char_count，表示特殊字符的最小字符数。
2. MySQL 5.6、MySQL 5.7：
选项 validate_password_policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password_length，表示密码总长度的最小字符数。
选项 validate_password_mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password_number_count，表示数字的最小字符数。
选项 validate_password_special_char_count，表示特殊字符的最小字符数。
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 要修改的密码复杂度的选项。每一个选项是以组合形式写入的，一个组合包括 Name 和 CurrentValue，其中 Name 表示对应选项的参数名，CurrentValue 表示参数值。例如：[{"Name": "validate_password.length", "CurrentValue": "10"}]，表示将密码的最小字符数修改为10。
说明：不同数据库版本的实例，支持修改的密码复杂度的选项如下。
1. MySQL 8.0：
选项 validate_password.policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password.length，表示密码总长度的最小字符数。
选项 validate_password.mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password.number_count，表示数字的最小字符数。
选项 validate_password.special_char_count，表示特殊字符的最小字符数。
2. MySQL 5.6、MySQL 5.7：
选项 validate_password_policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password_length，表示密码总长度的最小字符数。
选项 validate_password_mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password_number_count，表示数字的最小字符数。
选项 validate_password_special_char_count，表示特殊字符的最小字符数。
     * @param ParamList 要修改的密码复杂度的选项。每一个选项是以组合形式写入的，一个组合包括 Name 和 CurrentValue，其中 Name 表示对应选项的参数名，CurrentValue 表示参数值。例如：[{"Name": "validate_password.length", "CurrentValue": "10"}]，表示将密码的最小字符数修改为10。
说明：不同数据库版本的实例，支持修改的密码复杂度的选项如下。
1. MySQL 8.0：
选项 validate_password.policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password.length，表示密码总长度的最小字符数。
选项 validate_password.mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password.number_count，表示数字的最小字符数。
选项 validate_password.special_char_count，表示特殊字符的最小字符数。
2. MySQL 5.6、MySQL 5.7：
选项 validate_password_policy，表示密码复杂度的开关，值为 LOW 时表示关闭；值为 MEDIUM 时表示开启。温馨提示：如需修改具体的密码策略，此选项的值需为 MEDIUM。
选项 validate_password_length，表示密码总长度的最小字符数。
选项 validate_password_mixed_case_count，表示小写和大写字母的最小字符数。
选项 validate_password_number_count，表示数字的最小字符数。
选项 validate_password_special_char_count，表示特殊字符的最小字符数。
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    public ModifyInstancePasswordComplexityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancePasswordComplexityRequest(ModifyInstancePasswordComplexityRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ParamList != null) {
            this.ParamList = new Parameter[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new Parameter(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

