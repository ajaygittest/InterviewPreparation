import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'upperCase'
})
export class UpperCasePipe implements PipeTransform {

  transform(value: string, ...args: any[]): string {
    if(!value){
    return '';
    }
    return value.toUpperCase();
  }

}
