unsigned int smallest(const int *a, unsigned int len) {
    unsigned int index = 0;

    for (int i = 0; i < len; i++) {
        if (a[index] > a[i]) {
            index = i;
        }
    }

    return index;
}

void *sort(int *a, unsigned int len) {
    for (int i = 0; i < len; i++) {
        unsigned int min = smallest(a + i, len - i);

        /* swap */
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
}


int main(int argc, char *argv[]) {
    int arr[argc];

    sort(arr, argc);
}
